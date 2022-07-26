package com.xworkz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.BikeDTO;
import com.xworkz.service.BikeService;
import com.xworkz.service.BikeServiceImpl;

@Controller
@RequestMapping("/")
public class BikeController {

	@Autowired
	private BikeService bikeService;

	public BikeController() {
		System.out.println("BikeController() Invoked");
	}

	@RequestMapping("/getForm")
	public String saveForm() {
		System.out.println("getForm() Invoked");

		return "/WEB-INF/bikeform.jsp";
	}

	@RequestMapping("/readForm")
	public String readValue(@ModelAttribute BikeDTO dto, Model model) {
		System.out.println("readValue() Invoked");
		System.out.println("Bike name = " + dto.getBikeName());
		System.out.println("Bike color = " + dto.getBikeColor());
		System.out.println("Bike brand = " + dto.getBikeBrand());
		System.out.println("Bike Cost = " + dto.getBikeCost());
		System.out.println("Bike type = " + dto.getBikeType());

		boolean isvalid = this.bikeService.validate(dto);

		if (isvalid) {
			System.out.println("user data is valid..");
			boolean saved = this.bikeService.saveData(dto);

			if (saved = true) {
				System.out.println("user data is saved to db");
			} else {
				System.out.println("user data is not saved to db");
			}

		} else {
			System.out.println("user data is not valid..");
			Map<String, String> map = BikeServiceImpl.map;
			model.addAttribute("errorName", map.get("bikeName"));
			model.addAttribute("errorColor", map.get("bikeColor"));
			model.addAttribute("errorBrand", map.get("bikeBrand"));
			model.addAttribute("errorCost", map.get("bikeCost"));
			model.addAttribute("errorType", map.get("bikeType"));
		}
		return "/WEB-INF/bikeform.jsp";
	}
	@RequestMapping("/getAllbike")
	public String getAllbikeInformation(Model model) {
		System.out.println("getAllbikeInformation() Invoked");
		
		List<Object> listOfObjects =  this.bikeService.getlistOfBike();
		model.addAttribute("getAllBikes", listOfObjects);
		return "/WEB-INF/bikeform.jsp";
	}

	@RequestMapping(value = "/searchBike")
	public String searchBikeByBikeName(@RequestParam String bikeName, Model model) {
		System.out.println("searchBikeByBikeName Invoked()");
		boolean isBikeNameValid = this.bikeService.validateBikeName(bikeName);
		if (isBikeNameValid) {
			System.out.println("bike name is valid");
			BikeDTO dto = this.bikeService.getBikeDTOByBikeName(bikeName);
			if (dto != null) {
				model.addAttribute("BikeName", dto.getBikeName());
				model.addAttribute("BikeColor", dto.getBikeColor());
				model.addAttribute("BikeBrand", dto.getBikeBrand());
				model.addAttribute("BikeCost", dto.getBikeCost());
				model.addAttribute("BikeType", dto.getBikeType());
			} else {
				model.addAttribute("errorBikeName", "no data found for " + bikeName + " check spelling ");
			}

		} else {
			model.addAttribute("errorBikeName", "Invlid Input or ..enter valid data");
		}
		return "/WEB-INF/bikeform.jsp";

	}
	
	
}

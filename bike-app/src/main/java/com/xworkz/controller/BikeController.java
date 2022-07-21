package com.xworkz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BikeDTO;
import com.xworkz.service.BikeService;
import com.xworkz.service.BikeServiceImpl;

@Component
@RequestMapping("/")
public class BikeController {

	@Autowired
	private BikeService bikeService;

	public BikeController() {
		System.out.println("BikeController() Invoked");
	}

	@RequestMapping("/getForm")
	public String saveForm() {
		System.out.println("getForm() Invoked\n" + "\n");

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
}

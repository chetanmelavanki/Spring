package com.xworkz.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dao.BikeDao;
import com.xworkz.dto.BikeDTO;
import com.xworkz.entity.BikeEntity;

@Component
public class BikeServiceImpl implements BikeService {
	@Autowired
	private BikeDao bikeDao;

	public BikeServiceImpl() {
		System.out.println("BikeServiceImpl() Is Invoked");
	}

	public static Map<String, String> map = new HashMap<>();

	@Override
	public boolean validate(BikeDTO dto) {
		boolean flag = false;

		if (!dto.getBikeName().isEmpty() && !dto.getBikeName().isBlank() && dto.getBikeName() != null) {
			flag = true;
			System.out.println("Bike name is valid..");
		} else {
			flag = false;
			System.out.println("Bike name is Invalid..");
			map.put("bikeName", "Bike Name cannot be empty.");
			return flag;
		}

		if (!dto.getBikeColor().isBlank() && !dto.getBikeColor().isEmpty() && dto.getBikeColor() != null) {
			flag = true;
			System.out.println("Bike Color is valid..");
		} else {
			flag = false;
			System.out.println("Bike color is Invalid..");
			map.put("bikeColor", "Bike color cannot be empty.");
			return flag;
		}

		if (!dto.getBikeBrand().isBlank() && !dto.getBikeBrand().isEmpty() && dto.getBikeBrand() != null) {
			flag = true;
			System.out.println("Bike Brand is valid..");
		} else {
			flag = false;
			System.out.println("Bike Brand is Invalid..");
			map.put("bikeBrand", "Bike Brand cannot be empty.");
			return flag;
		}

		if (dto.getBikeCost() > 50000.00) {
			flag = true;
			System.out.println("Bike Cost is valid..");
		} else {
			flag = false;
			System.out.println("Bike cost is Invalid..");
			map.put("bikeCost", "Bike Cost cannot be empty.");
			return flag;
		}

		if (!dto.getBikeType().isBlank() && !dto.getBikeType().isEmpty() && dto.getBikeType() != null) {
			flag = true;
			System.out.println("Bike type is valid..");
		} else {
			flag = false;
			System.out.println("Bike type is Invalid..");
			map.put("bikeType", "Bike Type cannot be empty.");
			return flag;
		}

		return flag;
	}

	@Override
	public boolean saveData(BikeDTO dto) {

		// 1 step copy all data from entity class
//		BikeEntity bikeEntity = new BikeEntity(dto.getBikeName(), dto.getBikeColor(), dto.getBikeBrand(),
//				dto.getBikeCost(), dto.getBikeType());
		BikeEntity bikeEntity = new BikeEntity();
		BeanUtils.copyProperties(dto, bikeEntity);
		// 2 step invoke dao
		boolean isbikeEntitySaved = this.bikeDao.saveBikeEntity(bikeEntity);
		return isbikeEntitySaved;
	}

	@Override
	public boolean validateBikeName(String bikeName) {
		try {
			return bikeName != null && !bikeName.isEmpty() && !bikeName.isBlank() ? true : false;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public BikeDTO getBikeDTOByBikeName(String bikeName) {
		System.out.println("findBikeEntity Invioked()");

		BikeEntity bikeEntity = this.bikeDao.findBikeEntity(bikeName);
		BikeDTO bikeDTO = new BikeDTO();
		BeanUtils.copyProperties(bikeEntity, bikeDTO);
		return bikeDTO;
	}

	@Override
	public List<Object> getlistOfBike() {
		List<Object> listOfBikeObject=null;
		List<BikeEntity> list = this.bikeDao.getListOfBikeEntity();
		if (list!=null) {
			listOfBikeObject = new ArrayList<>();
			for (BikeEntity bikeEntity : list) {
				listOfBikeObject.add(bikeEntity);
				System.out.println(bikeEntity.toString());
			}
		} else {
			System.out.println("bike entity not found");
		}
	
		return listOfBikeObject;
	}

}

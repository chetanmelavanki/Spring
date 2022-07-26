package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.BikeDTO;
import com.xworkz.entity.BikeEntity;

public interface BikeService {
	public boolean validate(BikeDTO dto);

	public boolean saveData(BikeDTO bikeDTO);

	public boolean validateBikeName(String bikeName);

	public BikeDTO getBikeDTOByBikeName(String bikeName);

	public List<Object> getlistOfBike();
}

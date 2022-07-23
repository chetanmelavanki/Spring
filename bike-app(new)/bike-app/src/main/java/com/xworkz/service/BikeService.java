package com.xworkz.service;

import com.xworkz.dto.BikeDTO;
import com.xworkz.entity.BikeEntity;

public interface BikeService {
	public boolean validate(BikeDTO dto);

	public boolean saveData(BikeDTO bikeDTO);

	public boolean validateBikeName(String bikeName);

	public BikeEntity findBikeEntity(String bikeName);
}

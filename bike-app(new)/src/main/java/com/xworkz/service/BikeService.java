package com.xworkz.service;

import com.xworkz.dto.BikeDTO;

public interface BikeService {
	public boolean validate(BikeDTO dto);

	public boolean saveData(BikeDTO bikeDTO);
}

package com.xworkz.dao;

import java.util.List;

import com.xworkz.entity.BikeEntity;

public interface BikeDao {
	public boolean saveBikeEntity(BikeEntity bikeEntity);

	public BikeEntity findBikeEntity(String bikeName);

	public List<BikeEntity> getListOfBikeEntity();
}

package com.xworkz.dao;

import com.xworkz.entity.BikeEntity;

public interface BikeDao {
	public boolean saveBikeEntity(BikeEntity bikeEntity);

	public BikeEntity findBikeEntity(String bikeName);
}

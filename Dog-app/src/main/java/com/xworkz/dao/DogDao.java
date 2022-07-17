package com.xworkz.dao;

import com.xworkz.dogentity.DogEntity;

public interface DogDao {
	void saveDog(DogEntity dogEntity);
	void getDogById();
	void updateDog();
	void deleteDog();
	
	void updateDogNameByColor(String color,String name);
	void updateDogWeightByName(String name,double weight);
	void updateDogNameByWeight(double weight,String name);
	void updateDogColorByname(String name,String color);
	void updateDogIdByName(String name,int id);
	void updateDogWeightById(int id,double weight);
	
	void getAllDogEntity();
	
	void deleteDogEntityByName(String name);
	
	void getDogMinWeight();
	void getDogMaxWeight();
	void getDogAvgWeight();
	void getDogSumOfWeight();
	void getDogNameLikeP();
	void getDogNameEndsWithY();
	void getDogWeightBetween10And65();
	void getDogByName(String name);
	void getDogDuplicateByColor();
	void getDogByWeightAndId();
	void getDogByNameOrColour();
	
}

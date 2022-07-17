package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.xworkz.dao.DogDaoImpl;
import com.xworkz.dogentity.DogEntity;

public class DogTester {
	public static void main(String[] args) {
//	DogEntity dogEntity =  new DogEntity("Raja","blackyy",56.59);
//		DogDaoImpl daoImpl = new DogDaoImpl();
//		daoImpl.saveDog(dogEntity);
//		daoImpl.getDogById();
//		daoImpl.deleteDog();
//		daoImpl.updateDog();
//		daoImpl.updateDogNameByColor("Brown","GitchiG");
//		daoImpl.updateDogWeightByName("GitchiG",89.90);
//		daoImpl.updateDogNameByWeight(56.59,"GG");
//		daoImpl.updateDogColorByname("GitchiG","Bili");
//		daoImpl.updateDogIdByName("rocky",30);
//		daoImpl.updateDogWeightById(7,101.1);
//		daoImpl.getAllDogEntity();
//		daoImpl.getDogColor();
//		daoImpl.saveDogEntity();
//		daoImpl.deleteDogEntityByName("");
//		daoImpl.saveDogEntity();
//		daoImpl.getDogMinWeight();
//		daoImpl.getDogMaxWeight();
//		daoImpl.getDogAvgWeight();
//		daoImpl.getDogSumOfWeight();
//		daoImpl.getDogNameLikeP();
//		daoImpl.getDogNameEndsWithY();
//		daoImpl.getDogWeightBetween10And65();
//		daoImpl.getDogByName("");
//		daoImpl.getDogDuplicateByColor();
//		daoImpl.getDogByWeightAndId();
//		daoImpl.getDogByNameOrColour();
		
//		DogDaoImplSQL daoImplSQL = new DogDaoImplSQL();
//		daoImplSQL.updateDogNameByColor("", "");
//		daoImplSQL.getAllDogEntity();		
//		daoImplSQL.getAllDogEntity();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		DogDaoImpl dogDao = applicationContext.getBean(DogDaoImpl.class);

		DogEntity dogEntity = new DogEntity();
		dogEntity.setName("Rani");
		dogEntity.setColor("Brown");
		dogEntity.setWeight(97.87);
		dogDao.saveDog(dogEntity);
		//DogEntity dogEntity = new DogEntity(dogDao);
		
	}
	
}

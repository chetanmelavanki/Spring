package com.xworkz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.service.TrainService;
import com.xworkz.trainentity.TrainEntity;
@Service
public class ServiceImpl implements TrainService {
	 public ServiceImpl() {
		System.out.println(this.getClass().getSimpleName()+"Invoked");
	}
	@Autowired
	private TrainImpl trainImpl;
	

	@Override
	public boolean validateTrainEntity(TrainEntity entity) {
		boolean flag = true;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (entity.getTrainName() != null && !entity.getTrainName().isEmpty() && !entity.getTrainName().isBlank()) {
			flag = true;
			System.out.println("Train Name is valid = " + entity.getTrainName());
		} else {
			flag = false;
			System.out.println("Train Name is not valid="+entity.getTrainName());
			return flag;
		}

		if (entity.getTrainColor() != null && !entity.getTrainColor().isEmpty() && !entity.getTrainColor().isBlank()) {
			flag = true;
			System.out.println("Train Color is valid = " + entity.getTrainColor());
		} else {
			flag = false;
			System.out.println("Train Color is not valid= " + entity.getTrainColor());
			return flag;
		}
		if (entity.getTrainSpeed() > 0) {
			flag = true;
			System.out.println("Train Speed is valid = " + entity.getTrainSpeed());
		} else {
			flag = false;
			System.out.println("Train Speed is not valid= " + entity.getTrainSpeed());
			return flag;
		}

		if (entity.getTrainCompartments() != null && !entity.getTrainCompartments().isEmpty()
				&& !entity.getTrainCompartments().isBlank()) {
			flag = true;
			System.out.println("Train Compartments is valid = " + entity.getTrainCompartments());
		} else {
			flag = false;
			System.out.println("Train Compartments is not valid= " + entity.getTrainCompartments());
			return flag;
		}

		return flag;
	}
	
	public void saveToDb(TrainEntity entity) {
		trainImpl.saveTrain(entity);
	}
	

}

package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.TrainDAO;
import com.xworkz.impl.ServiceImpl;
import com.xworkz.impl.TrainImpl;
import com.xworkz.service.TrainService;
import com.xworkz.trainentity.TrainEntity;

public class ServiceTester {
	public static void main(String[] args) {
		trainTester();
	}

	public static void trainTester() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TrainImpl impl = applicationContext.getBean(TrainImpl.class);
		TrainEntity entity = new TrainEntity();
		entity.setTrainName("chetan");
		entity.setTrainColor("cyan");
		entity.setTrainSpeed(78);
		entity.setTrainCompartments("96j");
		impl.saveTrain(entity);
//		TrainEntity entity = new TrainEntity("shersha", "Green", 250, "300c");
		TrainService service = new ServiceImpl();
		boolean outcome = service.validateTrainEntity(entity);
		System.out.println(outcome);

		if (outcome) {
			TrainDAO dao = new TrainImpl();
			dao.saveTrain(entity);
			System.out.println("Entered Train Entity data is valid ");
		} else {
			System.out.println("Train is not valid .......Try Again");

		}
	}
}

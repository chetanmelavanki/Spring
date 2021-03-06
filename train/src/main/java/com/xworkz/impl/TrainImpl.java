package com.xworkz.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dao.TrainDAO;
import com.xworkz.trainentity.TrainEntity;

@Component
public class TrainImpl implements TrainDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public TrainImpl() {
		System.out.println("TrainImpl() Invoked");
	}
	Session session;
	Transaction transaction;
	@Override
	public void saveTrain(TrainEntity entity) {
		try {

			System.out.println("inside try");
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			System.out.println("transaction created");
			session.persist(entity);
			System.out.println("persit() Invoked");
			System.out.println("saved successfully");
			transaction.commit();
			System.out.println("transaction.commit()");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("session is closed");
			}
		}

	}

}

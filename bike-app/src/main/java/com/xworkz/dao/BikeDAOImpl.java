package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.entity.BikeEntity;

@Component
public class BikeDAOImpl implements BikeDao {

	@Autowired
	private SessionFactory sessionfactory;

	public BikeDAOImpl() {
		System.out.println(this.getClass().getSimpleName() + "bean created");
	}

	@Override
	public boolean saveBikeEntity(BikeEntity bikeEntity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			session.save(bikeEntity);
			transaction.commit();
			System.out.println("bike entity is saved..");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}
		return false;
	}

}

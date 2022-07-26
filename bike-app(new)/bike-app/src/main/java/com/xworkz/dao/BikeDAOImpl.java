package com.xworkz.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

	@Override
	public BikeEntity findBikeEntity(String bikeName) {
		System.out.println("findBikeEntity invoked from " + this.getClass().getSimpleName());
		Session session = null;
		BikeEntity bikeEntity = null;

		try {
			System.out.println("opening session");
			session = sessionfactory.openSession();
			System.out.println("session is opened");
			Query query = session.createNamedQuery("BikeEntity.findBikeEntity");
			query.setParameter("BIKENAME", bikeName);
			System.out.println("named query invoked");
			Object object = query.uniqueResult();
			System.out.println("query executed");
			bikeEntity = (BikeEntity) object;
			if (bikeEntity != null) {
				return bikeEntity;
			} else {
				System.out.println("bike entity not found");
			}

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

		return bikeEntity;
	}

	@Override
	public List<BikeEntity> getListOfBikeEntity() {
		System.out.println("getListOfBikeEntity invoked from " + this.getClass().getSimpleName());
		Session session = null;
		BikeEntity bikeEntity = null;
		List<BikeEntity> list=null;

		try {
			System.out.println("opening session");
			session = sessionfactory.openSession();
			System.out.println("session is opened");
			Query query = session.createNamedQuery("BikeEntity.getAllBike");
			list = query.list();
			
			return list;
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

		return list;
	}

}

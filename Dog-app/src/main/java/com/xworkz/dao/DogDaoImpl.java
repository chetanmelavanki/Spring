package com.xworkz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dogentity.DogEntity;

@Component
public class DogDaoImpl implements DogDao {

	@Autowired
	private SessionFactory sessionFactory;

	public DogDaoImpl(@Autowired SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		System.out.println("session created");
	}

	@Override
	public void saveDog(DogEntity dogEntity) {

		try {
			System.out.println("inside try");
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			System.out.println("transaction created");
			session.persist(dogEntity);
			System.out.println("persit() Invoked");
			System.out.println("saved successfully");
			transaction.commit();
			System.out.println("transaction.commit()");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void getDogById() {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			DogEntity dogEntity = session.get(DogEntity.class, 3);
			System.out.println("get details successfully");
			System.out.println("Details of Dog " + dogEntity);
			transaction.commit();
			sessionFactory.close();
			System.out.println(" Got successfully ");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDog() {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			DogEntity dogEntity = session.get(DogEntity.class, 4);
			dogEntity.setName("pinku");
			dogEntity.setColor("pink");
			dogEntity.setWeight(836.98);
			session.update(dogEntity);
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void deleteDog() {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			DogEntity dogEntity = session.get(DogEntity.class, 1);
			session.remove(dogEntity);
			transaction.commit();
			sessionFactory.close();
			System.out.println("delete successfully");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogNameByColor(String color, String name) {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createNamedQuery("updateDogNameByColor");
			query.setParameter("y", color);
			query.setParameter("x", name);
//			org.hibernate.query.Query query2 = session.createQuery("update DogEntity set name='Gunda' where color='" + color + "'");
			query.executeUpdate();

			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogWeightByName(String name, double weight) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
//			javax.persistence.Query query2 = session.createQuery("update DogEntity set weight=78.98 where name='" + name + "'");
//			query2.executeUpdate();
			Query query = session.createNamedQuery("updateDogWeightByName");
			query.setParameter("y", name);
			query.setParameter("x", weight);
			query.executeUpdate();
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogNameByWeight(double weight, String name) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
//			javax.persistence.Query query2 = session.createQuery("update DogEntity set name='pinki' where weight=" + weight + " ");
//			query2.executeUpdate();
			Query query = session.createNamedQuery("updateDogNameByWeight");
			query.setParameter("x", name);
			query.setParameter("y", weight);
			query.executeUpdate();
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogColorByname(String name, String color) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
//			javax.persistence.Query query2 = session.createQuery("update DogEntity set color='pink' where name='" + name + "' ");
//			query2.executeUpdate();
			Query query = session.createNamedQuery("updateDogColorByname");
			query.setParameter("y ", name);
			query.setParameter("x", color);
			query.executeUpdate();
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogIdByName(String name, int id) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
//			javax.persistence.Query query2 = session.createQuery("update DogEntity set id=10 where name='" + name + "' ");
//			query2.executeUpdate();
			Query query = session.getNamedQuery("updateDogIdByName");
			query.setParameter("y", name);
			query.setParameter("x", id);
			query.executeUpdate();
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogWeightById(int id, double weight) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
//			javax.persistence.Query query2 = session.createQuery("update DogEntity set weight=34.76 where id='" + id + "' ");
//			query2.executeUpdate();
			Query query = session.getNamedQuery("updateDogWeightById");
			query.setParameter("x", weight);
			query.setParameter("y", id);
			query.executeUpdate();
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getAllDogEntity() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			javax.persistence.Query query = session.createQuery("from DogEntity");
			Query query = session.createNamedQuery("getAllDogEntity");
			List list = query.getResultList();
			System.out.println(list);

			sessionFactory.close();

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void deleteDogEntityByName(String name) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
//			javax.persistence.Query query2 = session.createQuery("delete from DogEntity where name='" + name + "' ");
//			query2.executeUpdate();
			Query query = session.createNamedQuery("deleteDogEntityByName");
			query.executeUpdate();
			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully deleted");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogMinWeight() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String min = "select min(m.weight)from DogEntity m";
//			javax.persistence.Query query = session.createQuery(min);
//			Object k = ((org.hibernate.query.Query) query).uniqueResult();
			Query query = session.createNamedQuery("getDogMinWeight");
			Object k = query.uniqueResult();
			System.out.println("min weight=" + k);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogMaxWeight() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String max = "select max(w.weight)from DogEntity w";
//			javax.persistence.Query query = session.createQuery(max);
//			Object l = ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(l);
			Query query = session.createNamedQuery("getDogMaxWeight");
			Object k = query.uniqueResult();
			System.out.println("min weight=" + k);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogAvgWeight() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String avg = "select avg(a.weight)from DogEntity a";
//			javax.persistence.Query query = session.createQuery(avg);
//			Object m = ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(m);
			Query query = session.createNamedQuery("getDogAvgWeight");
			Object k = query.uniqueResult();
			System.out.println("Avg weight=" + k);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogSumOfWeight() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String sum = "select sum(weight)from DogEntity ";
//			javax.persistence.Query query = session.createQuery(sum);
//			Object s = ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(s);
			Query query = session.createNamedQuery("getDogSumOfWeight");
			Object k = query.uniqueResult();
			System.out.println("Sum Of weight=" + k);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogNameLikeP() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String start = "select name from DogEntity where name LIKE 'P%'";
//			javax.persistence.Query query = session.createQuery(start);
//			Object s = ((org.hibernate.query.Query) query).list();
//			System.out.println(s);
			Query query = session.createNamedQuery("getDogNameLikeP");
			Object object = query.uniqueResult();
			System.out.println(object);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogNameEndsWithY() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String end = "select name from DogEntity where name LIKE '%y'";
//			javax.persistence.Query query = session.createQuery(end);
//			Object s = ((org.hibernate.query.Query) query).list();
//			System.out.println(s);
			Query query = session.createNamedQuery("getDogNameEndsWithY");
			Object object = query.uniqueResult();
			System.out.println(object);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogWeightBetween10And65() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String betn = "from DogEntity where weight BETWEEN 30 and 65";
//			javax.persistence.Query q = session.createQuery(betn);
//			List l = ((org.hibernate.query.Query) q).list();
//			System.out.println(l);
			Query query = session.createNamedQuery("getDogWeightBetween10And65");
			List list = query.list();
			System.out.println(list);

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogByName(String name) {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String gen = "froM DogEntity where name='" + name + "'";
//			javax.persistence.Query query = session.createQuery(gen);
//			List results = ((org.hibernate.query.Query) query).list();
//			System.out.println(results);
			Query query = session.createNamedQuery("getDogByName");
			List list = query.list();
			System.out.println(list);
		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogDuplicateByColor() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String sop = "SeLecT DisTincT color from DogEntity";
//			org.hibernate.query.Query query = session.createQuery(sop);
//			List res = ((org.hibernate.query.Query) query).list();
//			System.out.println(res);
			Query query = session.createNamedQuery("getDogDuplicateByColor");
			List list = query.list();
			System.out.println(list);
		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogByWeightAndId() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String st = "from DogEntity wHere weight=37.59 AnD id=7";
//			javax.persistence.Query query = session.createQuery(st);
//			Object result = ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(result);
			Query query = session.createNamedQuery("getDogByWeightAndId");
			Object object = query.uniqueResult();
			System.out.println(object);
		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void getDogByNameOrColour() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			String stop = "FRom DogEntity wherE name='PInKy' oR color='pInk'";
//			javax.persistence.Query query = session.createQuery(stop);
//			Object result = ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(result);
			Query query = session.createNamedQuery("getDogByNameOrColour");
			Object object = query.uniqueResult();
			System.out.println(object);
		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

}

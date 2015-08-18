package com.bean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCustomer {
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		CustomerInformation cust1=new CustomerInformation();
		cust1.setCustomerName("Saumil");
		cust1.setCustomerEmail("scm457@nyu.edu");
		
		// like insert query
				session.persist(cust1);
				Integer id1 = (Integer)session.save(cust1);
				System.out.println("ID = "+id1);
				
		
		CustomerInformation cust2=new CustomerInformation();
		cust2.setCustomerName("Saumil");
		cust2.setCustomerEmail("scm457@nyu.edu");
		
		
		session.persist(cust2);
		Integer id2 = (Integer)session.save(cust2);
		System.out.println("ID = "+id2);
		
		tr.commit();
		
		session.close();
		
		System.out.println("Successfully done...");
		

	}

}

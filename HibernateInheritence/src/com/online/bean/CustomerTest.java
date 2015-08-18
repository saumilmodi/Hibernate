package com.online.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		CustomerAddressInformation cai1=new CustomerAddressInformation();
		cai1.setCid(1);
		cai1.setName("Saumil");
		cai1.setAptno(102);
		cai1.setAptname("Shalibhadra");
		cai1.setStreet("Paldi");
		session.save(cai1);
		
		
		CustomerAddressInformation cai2=new CustomerAddressInformation();
		cai2.setCid(2);
		cai2.setName("Ajay");
		cai2.setAptno(108);
		cai2.setAptname("PrakashHighSchool");
		cai2.setStreet("Vasna");
		session.save(cai2);
		
		
		CustomerInformation ci1=new CustomerInformation();
		ci1.setCid(3);
		ci1.setName("Paresh");
		ci1.setEmail("scm457@nyu.edu");
		ci1.setPhoneNumber(4845426);
		session.save(ci1);
		
		tr.commit();
		System.out.println("Successfully implemented");
		
	}

}

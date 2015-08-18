package com.online.OnToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddressTest {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();		
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		
		Address address1=new Address();
		address1.setAid(1);
		address1.setAptname("Shalibhadra");
		address1.setStreet("Paldi");
		
		List<Employee> employeeList=new ArrayList<Employee>();
		
		
		Employee emp1=new Employee();
		emp1.setEname("Saumil");
		emp1.setPhonenumber(484542);
		
		Employee emp2=new Employee();
		emp2.setEname("Raj");
		emp2.setPhonenumber(845764);
		
		Employee emp3=new Employee();
		emp3.setEname("Paresh");
		emp3.setPhonenumber(9898545);
		
		employeeList.add(0,emp1);
		employeeList.add(1,emp2);
		employeeList.add(2,emp3);
		
		address1.setEmployee(employeeList);
		
		session.save(address1);
		
		tr.commit();
		session.close();
		System.out.println("Properly Done.");
		
	}

}

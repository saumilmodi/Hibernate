package com.online;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void main(String[] args) 
	{
			Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory factory=configuration.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
			
			Address address1=new Address("Paldi","Ahmedabad","Gujarat","India");
			Address address2=new Address("Vasna","Ahmedabad","Gujarat","India");
			Address address3=new Address("Laidlaw","Jersey","New Jersey","USA");
			Address address4=new Address("Laidlaw","Jersey","New Jersey","USA");
			session.save(address1);
			session.save(address2);
			session.save(address3);
			session.save(address4);
			
			Employee emp1=new Employee("Saumil","Modi",80000,address1);
			Employee emp2=new Employee("Rajan","Shah", 75000, address3);
			Employee emp3=new Employee("Harsh","Bhetaria",50000,address1);
			
			session.save(emp1);
			session.persist(emp2);
			session.save(emp3);
			/*Integer eId=(Integer)session.save(emp1);
			System.out.println("Id is : "+eId);

			session.persist(emp2);
			eId=(Integer)session.save(emp2);
			System.out.println("Id is : "+eId);
			
			eId=(Integer)session.save(emp3);
			System.out.println("Id is :"+eId);
			
			Employee emp=(Employee)session.get(Employee.class,2);
			System.out.println("Eid is :"+emp.geteId());
			System.out.println("Fname is :"+emp.getFname());
			System.out.println("Lname is :"+emp.getLname());
			System.out.println("Salary is :"+emp.getSalary());
			
			
			Employee empLoad=(Employee)session.load(Employee.class,3);
			System.out.println("Eid is :"+empLoad.geteId());
			System.out.println("Fname is :"+empLoad.getFname());
			System.out.println("Lname is :"+empLoad.getLname());
			System.out.println("Salary is :"+empLoad.getSalary());
*/			
			tr.commit();
			session.close();	

			System.out.println("Successfully done transaction.");
	}

}

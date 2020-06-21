package com.lti.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	/*StudentName stdName = new StudentName();
    	stdName.setFirstName("Nishant");
    	stdName.setMiddleName("Chandrabhan");
    	stdName.setLastName("Singh");
    	
       Student std = new Student();
       std.setS_id(3);
       std.setS_name(stdName);
       std.setS_add("Mumbai");*/
    	   	
    	Employee emp = new Employee();
    	emp.setEid(201);
    	emp.setEname("Akhilesh");
    	emp.setEadd("Pune");
    
    	
    	Laptop laptop = new Laptop();
    	laptop.setLid(101);
    	laptop.setLname("HP");
    	laptop.getEmp().add(emp);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Employee.class);
       
       ServiceRegistry ser = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       
       SessionFactory sf = con.buildSessionFactory(ser);
       
       Session session = sf.openSession();
       
      Transaction tx = session.beginTransaction();
       
       session.save(emp);
       session.save(laptop);
     // std = (Student) session.get(Student.class, 1);
       
       tx.commit();
       
       System.out.println(emp);
       System.out.println(laptop);
    		   
    }
}

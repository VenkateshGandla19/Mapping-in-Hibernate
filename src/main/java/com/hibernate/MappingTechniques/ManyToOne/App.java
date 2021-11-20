package com.hibernate.MappingTechniques.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("Venkat");
		s1.setMarks(88);
		
		Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("Nagesh");
		s2.setMarks(80);
		
		Laptop laptop1 = new Laptop();
		laptop1.setLaptopId(101);
		laptop1.setLaptopName("ASUS");
		laptop1.setStudent(s1);
		
		Laptop laptop2 = new Laptop();
		laptop2.setLaptopId(102);
		laptop2.setLaptopName("HP");
		laptop2.setStudent(s1);
		
		s1.getLaptop().add(laptop1);
		s1.getLaptop().add(laptop2);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(laptop1);
		session.save(laptop2);
		
		
		session.getTransaction().commit();
		
		
		
		
		
		
		
		
		
		
	}

}

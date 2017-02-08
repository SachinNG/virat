package com.mypack;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hb1.Employee;


public class AnnatationConfiguration {
	public static void main(String[] args) { 
		
      
		 Session session=new AnnotationConfiguration()  
         .configure().buildSessionFactory().openSession(); 
		
	
		 Transaction t=session.beginTransaction();	
    Employee e1=new Employee();  
    e1.setId(1001);  
    e1.setName("sonoo");  
   
      
    Employee e2=new Employee();  
    e2.setId(1002);  
    e2.setName("vimal");  
   
      
    session.persist(e1);  
    session.persist(e2);  
      
    t.commit();  
    session.close();  
    System.out.println("successfully saved");
		
	}
}

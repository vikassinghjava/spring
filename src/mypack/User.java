package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class User 
{
   public static void main(String[] args) 
   {
	  Configuration cfg=new Configuration().configure();
	  SessionFactory fac=cfg.buildSessionFactory();
	  Session session=fac.openSession();
	  Transaction tr=session.beginTransaction();
	  
	  Person p1=new Person("amit");
	  Emp e1=new Emp("rahul","develeper",10000);
	  Student s1=new Student("Kunal","Betch",20000);
	  
	  session.save(p1);
	  session.save(e1);
	  session.save(s1);
	  
	  tr.commit();
	  session.close();
	  System.out.println("Done!!!");
   }
}

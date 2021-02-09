package com.duhan.HibernateProject;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        alien duhan = new alien();

        Laptop lp  = new Laptop();
        lp.setLid(101);
        lp.setLname("Dell");
        
        Student s = new Student();
        s.setRoll_no(1);
        s.setName("dinesh");
        s.setMarks(50);
        s.getLaptop().add(lp);
        
        
        
      Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
      SessionFactory sf = con.buildSessionFactory();
      Session session = sf.openSession();
     
      Transaction tx = session.beginTransaction();
     
     session.save(s);
     session.save(lp); 
     
     tx.commit();
     
    }
}

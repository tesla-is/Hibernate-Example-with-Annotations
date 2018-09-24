package src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestRun {

    public static void main(String[] args) {
        
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        
        Doctor d=new Doctor();
        d.setId(100);
        d.setName("Ram Kumar");
        d.setAddress("Delhi");
        
        session.persist(d);
        transaction.commit();
        session.close();
        
        System.out.println("Success!");
        
    }
    
}

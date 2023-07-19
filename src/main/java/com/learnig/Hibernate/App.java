package com.learnig.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student st=new Student();
        st.setId(106);
        st.setName("Vaibhav Arora");
        st.setAddress("Delhi");
        st.setContact(912333);
        
        System.out.println(st.toString());
        
        //Session factory gives us a factory of session.
        //Usually SessionFactory is bean cofigure by the configration file named as hibernate.cfg.xml
         

    Configuration cfg = new Configuration();
    cfg.configure("Hibernate.config.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    //buildSessionFactory() build the sessionFactory for us
    //session is created by calling openSesion() methos on session Fctory objext
    
    Session session = factory.openSession();
    session.beginTransaction();
    
    session.save(st); // Here, we have saved the object. we can perform load, merge and remove.
     
    session.getTransaction().commit();
    
    //When transaton is done we need to to close session.
    session.close();
    
    System.out.println(factory);
    System.out.println(factory.isClosed());
    
    }
}
 
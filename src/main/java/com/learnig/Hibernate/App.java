package com.learnig.Hibernate;

import org.hibernate.SessionFactory;
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

    Configuration cfg = new Configuration().configure("Hibernate.config.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    System.out.println(factory);
    System.out.println(factory.isClosed());
    
    }
}

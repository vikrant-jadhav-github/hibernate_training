package com.first.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");

        SessionFactory factory = cf.buildSessionFactory();
        Person p = new Person(11, "John", "23", "M", new Person_details(1, 2));
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(p);
        tx.commit();
        session.close();
    }
}

package com.first.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        SessionFactory factory = cf.buildSessionFactory();
        Session session = factory.openSession();
        Person p = session.get(Person.class, 10);
        System.out.println("OUTPUT " + p.getName() + " " + p.getAge() + " " + p.getGender());
        session.close();
        factory.close();
    }
}

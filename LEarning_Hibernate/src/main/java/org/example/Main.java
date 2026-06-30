package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory fac=new Configuration().configure().buildSessionFactory();
        Session session=fac.openSession();
        Students st=new Students("Mammu",100);
        session.beginTransaction();
        session.persist(st);
        session.getTransaction().commit();
        session.close();
        fac.close();
    }
}
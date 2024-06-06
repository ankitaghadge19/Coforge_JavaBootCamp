package com.pack.hbutil;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryprovider {
    public static SessionFactory provideSessionFactory()  {
        Configuration configuration =new Configuration();
        configuration.configure("hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }
}
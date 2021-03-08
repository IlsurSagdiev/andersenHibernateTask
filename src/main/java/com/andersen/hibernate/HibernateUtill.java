package com.andersen.hibernate;

import com.andersen.hibernate.entity.Role;
import com.andersen.hibernate.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {

    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Role.class)
                .buildSessionFactory();
        return sessionFactory;
    }
}

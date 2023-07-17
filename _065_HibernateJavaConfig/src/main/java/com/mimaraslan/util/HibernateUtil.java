package com.mimaraslan.util;


import com.mimaraslan.model_entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    private  static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {


        if(sessionFactory == null) {

            try {

                Configuration configuration = new Configuration();

                    Properties settings = new Properties();

                    // MySQL
                    settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
                    settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                    settings.put(Environment.URL, "jdbc:mysql://localhost:3306/businessDB");
                    settings.put(Environment.USER, "root");
                    settings.put(Environment.PASS, "123456789");

                  // PostgreSQL
             ;

                    settings.put(Environment.SHOW_SQL, "true");
                    settings.put(Environment.FORMAT_SQL, "true");
                    settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                    settings.put(Environment.HBM2DDL_AUTO, "create");
                    settings.put(Environment.QUERY_TRANSLATOR, "org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory");


                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Student.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                 sessionFactory = configuration.buildSessionFactory(serviceRegistry);



            }catch (Exception e){
                System.err.println("Hata: " + e);
            }

        }

            return sessionFactory;

    }

}

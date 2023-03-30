package com.carparking.dataSources;

import com.carparking.entity.ResidentInformation;
import com.carparking.entity.VechicleInFo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataSources {
    public  void storeDataInDatabase(ResidentInformation residentInformation, VechicleInFo vechicleInFo) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
           // configuration.addAnnotatedClass(ResidentInformation.class);
       //  configuration.addAnnotatedClass(vechicleInFo.class);

            //creater Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
        vechicleInFo.setResidentInformation(residentInformation);
           session.save(vechicleInFo);

            transaction.commit();
        }catch (Exception e) {
            System.out.println("Error Details ::" + e.getMessage());
        }finally{
            if (session != null){
                session.close();
            }

        }

    }

}

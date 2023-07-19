package com.mimaraslan;

import com.mimaraslan.model.Address;
import com.mimaraslan.model.Customer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setTitle("Dr");
        customer1.setFirstName("Caner");
        customer1.setLastName("Öksüz");

        Customer customer2 = new Customer();
        customer2.setTitle("Dr");
        customer2.setFirstName("Burak");
        customer2.setLastName("Delice");

        Address address1 = new Address("Türkiye", "Ankara", "Mustafa");
        Address address2 = new Address("Türkiye", "İstanbul", "Kemal");
        Address address3 = new Address("Türkiye", "Çanakkale", "Atatürk");

        Set<Address> addressesList = new HashSet<>();
        addressesList.addAll(Arrays.asList(address1, address2, address3));

        customer1.getAddresses().add(address1);
        customer1.getAddresses().add(address2);
        customer2.getAddresses().add(address3);

        Customer customer3 = new Customer("Doc", "Ünal", "Berk", addressesList);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(customer1);
            session.save(customer2);
            session.save(customer3);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata : " + e);
        } finally {
            session.close();
        }


    }
}

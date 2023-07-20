package com.mimaraslan;


import com.mimaraslan.model.Customer;
import com.mimaraslan.model.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setTitle("MSc.Computer Engineer");
        customer.setFirstname("Burak");
        customer.setLastname("Bey");

        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setAddress("Ankara");
        customerDetail.setPhone("111");
        customerDetail.setCreationDate(new Date());
        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);

        Customer customer2 = new Customer("Dr.", " Engin", " Bey");
        CustomerDetail customerDetail2 = new CustomerDetail(" Adana", "222", new Date());
        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
         //   session.save(customer);
         //   session.save(customer2);

            Query query = session.createQuery("from Customer");
            List<Customer> customerList = query.list();
            for (Customer cust : customerList) {
                System.out.println(cust.getTitle() + " " + cust.getFirstname() + " " + cust.getLastname());
            }
            
            System.out.println("============== where id=1 ================");
            
            Query query2 = session.createQuery("from Customer where id=:id");
            query2.setLong("id", 1);
            Customer cust2 = (Customer) query2.uniqueResult();
            System.out.println(cust2);
            System.out.println(cust2.getTitle() + " " + cust2.getFirstname() + " " + cust2.getLastname());

            System.out.println("============== update ================");
            
            query = session.createQuery("update Customer " +
                    "set title=:title,firstname=:first_name,lastname=:last_name " +
                    "where id=:id");
            query.setParameter("title", "Prof. Dr.");
            query.setParameter("first_name", "Yiğitcan");
            query.setParameter("last_name", "Bey");
            query.setLong("id", 1);


            int result = query.executeUpdate();
            System.out.println("Update Sonucu: " + result);


            query = session.createQuery("from Customer");
            customerList = query.list();

            for (Customer cust1 : customerList) {
                System.out.println(cust1.getTitle() + " " + cust1.getFirstname() + " " + cust1.getLastname());
            }

            System.out.println("============== delete ================");

            query = session.createQuery("delete from CustomerDetail where id=:id");
            query.setLong("id", 6);

            int delete = query.executeUpdate();
            System.out.println("CustomerDetail Delete Sonucu: " + delete);

            query = session.createQuery("delete from Customer where id=:id");
            query.setLong("id", 6);

            delete = query.executeUpdate();
            System.out.println("Custoemer Delete Sonucu: " + delete);

            System.out.println("============== AVG SUM MIN MAX COUNT ================");

            query = session.createQuery("select count(*) from Customer");

            Long customerCount = (Long) query.uniqueResult();

            System.out.println("Sistemdeki toplam müşteri sayısı: " + customerCount);

            System.out.println("============== JOIN ================");

            query = session.createQuery("select c.title, c.firstname, c.lastname, d.address from Customer c " +
                    "INNER JOIN CustomerDetail d " +
                    "ON c.id = d.id");

            List<Object[]> myList = query.list();
            for (Object[] arr : myList) {
                System.out.println(Arrays.toString(arr));
            }
            
            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata: " + e);
        } finally {
            session.close();
        }


    }
}
package com.mimaraslan.dao;

import com.mimaraslan.model.Seller;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SellerDAO {

    public void saveOrUpdateSeller(Seller seller){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.saveOrUpdate(seller);
            transaction.commit();

        } catch (Exception ex){
            if(transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public Seller getSellerById(Long id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Seller.class, id);
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public List<Seller> getAllSellers(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Seller", Seller.class).list();
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public void deleteSellerById(int id){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            // Once verilen id uzerinden kaydi bul
            Seller seller = session.get(Seller.class, id);
            if(seller != null){
                session.delete(seller);
            }
            transaction.commit();

        } catch (Exception ex){
            if(transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }

    }

}
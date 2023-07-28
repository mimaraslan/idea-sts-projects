package com.caneroksuz.repository;

import com.caneroksuz.model.Ev;
import com.caneroksuz.model.Kisi;
import com.caneroksuz.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class EvRepository {

    public List<Ev> kiradaOlanEvler(){

        String hql="SELECT e FROM Ev e where e.durum='KIRADA'";
        Session session = HibernateUtil.getSessionFactory().openSession();
        TypedQuery<Ev> typedQuery =session.createQuery(hql, Ev.class);
        return typedQuery.getResultList();
    }

    public Ev evOlustur(Ev ev) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(ev);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return ev;
    }

    public Ev evAraById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.println("EV DURUMU: " +session.get(Ev.class, id));
            return session.get(Ev.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Ev> kiradakiEvler() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Ev WHERE durum = 'KIRADA'", Ev.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Ev> musaitEvler() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Ev WHERE durum = 'MUSAIT'", Ev.class).list();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}

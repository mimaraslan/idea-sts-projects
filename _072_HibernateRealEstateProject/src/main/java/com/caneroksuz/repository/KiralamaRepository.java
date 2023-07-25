package com.caneroksuz.repository;

import com.caneroksuz.model.Kisi;
import com.caneroksuz.utility.HibernateUtil;
import org.hibernate.Session;

public class KiralamaRepository {
    public void kiradakiEvler() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Ev ", Kisi.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

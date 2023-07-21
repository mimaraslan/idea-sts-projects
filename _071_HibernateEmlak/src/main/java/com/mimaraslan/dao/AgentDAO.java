package com.mimaraslan.dao;

import com.mimaraslan.model.Agent;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AgentDAO {

  public void saveOrUpdateAgent(Agent agent){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
                session.saveOrUpdate(agent);
            transaction.commit();

        } catch (Exception ex){
            if(transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

//  void saveAgent(){}
//  void updateAgent(){}

    public Agent getAgentById(Long id){
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
             return session.get(Agent.class, id);
       } catch (Exception ex){
           ex.printStackTrace();
           return null;
       }
  }
    public List<Agent> getAllAgents(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Agent", Agent.class).list();
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
  }
    public void deleteAgentById(int id){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            // Once verilen id uzerinden kaydi bul
            Agent agent = session.get(Agent.class, id);
            if(agent != null){
                session.delete(agent);
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

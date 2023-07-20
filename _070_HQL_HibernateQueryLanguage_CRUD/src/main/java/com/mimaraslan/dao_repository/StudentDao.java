package com.mimaraslan.dao_repository;

import com.mimaraslan.model_entity.Student;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao {

    // save == insert
    // SQL'deki normal INSERT deyimine dikkat! HQL onu SQL'deki gibi kullanmaz!
    // Normal 1 tane kayıt ekleyeceksiniz, eklemeyi session.save(Object) yöntemi ile yaparız.
    // HQL'deki INSERT sadece toplu veriler eklemek içindir.
    public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();

        } catch (Exception e) {
            System.out.println("Hata: " + e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    // SQL'deki normal INSERT deyimine dikkat! HQL onu SQL'deki gibi kullanmaz!
    // Normal 1 tane kayıt ekleyeceksiniz, eklemeyi session.save(Object) yöntemi ile yaparız.
    // HQL'deki INSERT sadece toplu veriler eklemek içindir.
    public void insertStudent() {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();


            // SQL'deki normal INSERT deyimine dikkat! HQL onu SQL'deki gibi kullanmaz!
            // Normal 1 tane kayıt ekleyeceksiniz, eklemeyi session.save(Object) yöntemi ile yaparız.
            // HQL'deki INSERT sadece toplu veriler eklemek içindir.

            //Seçilen tablodaki sadece 1 kaydı diğer hedef tabloya eklemek için INSERT kullanımı.
            String hqlOneRow = "INSERT INTO Student(firstName, lastName, email) " + // HEDEF TABLO
                    "SELECT firstName, lastName, email FROM Student WHERE id = 1"; // SECILEN TABLO

            //Seçilen tablodaki birden fazla kaydı diğer hedef tabloya eklemek için INSERT kullanımı.
            String hqlMultiRows = "INSERT INTO Student(firstName, lastName, email) " + // HEDEF TABLO
                    "SELECT firstName, lastName, email FROM Student where id BETWEEN 1 AND 4"; // SECILEN TABLO

            //Seçilen tablodaki bütün katıtları diğer hedef tabloya eklemek için INSERT kullanımı.
            String hql = "INSERT INTO Student(firstName, lastName, email) " + // HEDEF TABLO
                    "SELECT firstName, lastName, email FROM Student";  // SECILEN TABLO

            Query query = session.createQuery(hql);

            int result = query.executeUpdate();
            System.out.println("Insert sonuc: " + result);

            transaction.commit();

        } catch (Exception e) {
            System.out.println("Hata: " + e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "UPDATE Student " +
                    "SET firstName =  :first_name, " +
                    "lastName      =  :last_name, " +
                    "email         =  :email " +
                    "WHERE id      =  :id";
            Query query = session.createQuery(hql);

            query.setParameter("first_name", student.getFirstName());
            query.setParameter("last_name", student.getLastName());
            query.setParameter("email", student.getEmail());
            query.setParameter("id", student.getId());

            int result = query.executeUpdate();
            System.out.println("Update sonuc: " + result);

            transaction.commit();

        } catch (Exception e) {
            System.out.println("Hata: " + e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "DELETE FROM Student " +
                    " WHERE id      =  :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);

            int result = query.executeUpdate();
            System.out.println("Delete sonuc: " + result);

            transaction.commit();

        } catch (Exception e) {
            System.out.println("Hata: " + e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Student getStudent(int id) {

        Student student = null;
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "FROM Student " +
                    " WHERE id      =  :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);

           /*
            List results =  query.getResultList();

            if((results != null) && (!results.isEmpty())){
                student = (Student) results.get(0);
            }
            */

            // tekil dönüş için
            student = (Student) query.uniqueResult();

            transaction.commit();
        } catch (Exception e) {
            System.out.println("Hata: " + e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return student;
    }

    // read all - select
    public List<Student> getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student order by id asc", Student.class).list();
        }
    }

}

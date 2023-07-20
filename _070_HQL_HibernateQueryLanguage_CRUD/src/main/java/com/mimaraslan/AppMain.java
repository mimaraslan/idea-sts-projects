package com.mimaraslan;

import com.mimaraslan.dao_repository.StudentDao;
import com.mimaraslan.model_entity.Student;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Student student1 = new Student("Aysu", "Çağışlar", "aaa@gmail.com");
        Student student2 = new Student("Burak", "Delice", "bbb@gmail.com");
        Student student3 = new Student("Caner", "Mehmet", "ccc@gmail.com");

        Student student4 = new Student();
        student4.setFirstName("Gizem");
        student4.setLastName("Kuşcuoğlu");
        student4.setEmail("ddd@gmail.com");

        StudentDao studentDao = new StudentDao();
        System.out.println("\n-------SAVE ADD---------------");
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);
        studentDao.saveStudent(student4);


        // System.out.println("-------INSERT---------------");
        // SQL'deki normal INSERT deyimine dikkat! HQL onu SQL'deki gibi kullanmaz!
        // Normal 1 tane kayıt ekleyeceksiniz, eklemeyi session.save(Object) yöntemi ile yaparız.
        // HQL'deki INSERT sadece toplu veriler eklemek içindir.
        // studentDao.insertStudent();


        System.out.println("\n-------UPDATE---------------");
        Student student5 = new Student();
        student5.setFirstName("Aminenur");
        student5.setLastName("Göynük");
        student5.setEmail("yyyy@gmail.com");
        student5.setId(2);

        studentDao.updateStudent(student5);

        System.out.println("\n--------DELETE--------------");
        studentDao.deleteStudent(6);

        System.out.println("\n-------SELECT---------------");
        Student student6 = studentDao.getStudent(1);
        System.out.println(student6.getId() + " " + student6.getFirstName() + " " + student6.getLastName() + " " + student6.getEmail());

        System.out.println("\n-------SELECT ALL-------------");
        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getId() + " " +s.getFirstName() + " " + s.getLastName() + " " + s.getEmail()));

    }
}
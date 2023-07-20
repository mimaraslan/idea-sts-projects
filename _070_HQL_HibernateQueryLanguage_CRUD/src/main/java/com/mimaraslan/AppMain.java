package com.mimaraslan;

import com.mimaraslan.dao_repository.StudentDao;
import com.mimaraslan.model_entity.Student;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Student student1 = new Student("Aysu", "Çağışlar","aaa@gmail.com");
        Student student2 = new Student("Burak", "Delice", "bbb@gmail.com");
        Student student3 = new Student("Caner", "Mehmet", "ccc@gmail.com");

        Student student4 = new Student();
        student4.setFirstName("Gizem");
        student4.setLastName("Kuşcuoğlu");
        student4.setEmail("ddd@gmail.com");

        StudentDao studentDao = new StudentDao();
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);
        studentDao.saveStudent(student4);


        studentDao.insertStudent(new Student("Demo", "Lolo","yyy@gmail.com"));


        Student student5 = new Student();
        student5.setFirstName("Aminenur");
        student5.setLastName("Göynük");
        student5.setEmail("yyyy@gmail.com");
        student5.setId(2);

        studentDao.updateStudent(student5);


        studentDao.deleteStudent(7);

        System.out.println("----------------------");
       Student student6 = studentDao.getStudent(5);
        System.out.println(student6.getFirstName());
        System.out.println("----------------------");


        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail()));

    }
}
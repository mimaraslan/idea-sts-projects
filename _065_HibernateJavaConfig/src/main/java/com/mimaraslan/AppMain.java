package com.mimaraslan;

import com.mimaraslan.dao_repository.StudentDao;
import com.mimaraslan.model_entity.Student;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

     //   System.out.println(UUID.randomUUID());


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

        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail()));

    }
}
package com.mimaraslan;

import com.mimaraslan.dao_repository.StudentDao;
import com.mimaraslan.model_entity.Student;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        StudentDao studentDao = new StudentDao();

        Student student1 = new Student("Aysu", "Çağışlar","aaa@gmail.com");
        Student student2 = new Student("Burak", "Delice", "bbb@gmail.com");
        Student student3 = new Student("Caner", "Mehmet", "ccc@gmail.com");

        Student student4 = new Student();
        student4.setFirstname("Gizem");
        student4.setLastname("");


        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);

        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstname() + " " + s.getLastname() + " " + s.getEmail()));

    }
}
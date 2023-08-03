package com.mimaraslan.service;

import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student getOneStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteOneStudent(Long id) {
         studentRepository.deleteById(id);
         return "Silindi";
    }

    public Student updateOneStudent(Student studentInfo) {
        return studentRepository.save(studentInfo);
    }
}

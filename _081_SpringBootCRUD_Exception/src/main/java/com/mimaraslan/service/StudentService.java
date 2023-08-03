package com.mimaraslan.service;

import com.mimaraslan.exception.ResourceNotFoundException;
import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


    public ResponseEntity<Student> getOneStudent(Long id)  throws ResourceNotFoundException {

        Student student = studentRepository.findById(id)
                .orElseThrow( ()-> new ResourceNotFoundException("Student not found ID : " + id )   );

        return ResponseEntity.ok().body(student);
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

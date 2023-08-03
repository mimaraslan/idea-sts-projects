package com.mimaraslan.service;

import com.mimaraslan.exception.ResourceNotFoundException;
import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
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
        //        return ResponseEntity.ok(student);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Map<String,Boolean> deleteOneStudent(Long id) throws ResourceNotFoundException {
        Student student = studentRepository.findById(id)
                .orElseThrow( ()-> new ResourceNotFoundException("Student not found ID : " + id) );
        studentRepository.deleteById(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Delete",Boolean.TRUE);
        return response;
    }

    public ResponseEntity<Student> updateOneStudent(Student studentInfo) throws ResourceNotFoundException{
        Student student = studentRepository.findById(studentInfo.getId())
                .orElseThrow( ()-> new ResourceNotFoundException("Student not found ID : " + studentInfo.getId()) );
        return ResponseEntity.ok(studentRepository.save(student));
    }


}

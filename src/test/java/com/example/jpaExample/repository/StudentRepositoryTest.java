package com.example.jpaExample.repository;

import com.example.jpaExample.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testStudentRepository() {
        var student = studentRepository.findAll();
        log.info("Student: {}", student);
    }

    @Test
    void saveStudent() {
        var student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .emailId("johndoe12qq@gmail.com")
                .guardianName("John Doe")
                .guardianEmail("johndoe@gmail.com")
                .guardianMobile("1234567890")
                .build();
        studentRepository.save(student);

        var students = studentRepository.findAll();
        log.info("Student: {}", students);
    }


}
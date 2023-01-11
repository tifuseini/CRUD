package com.example.jpaExample.repository;

import com.example.jpaExample.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    Iterable<Course> findAllByCategory(String category);

}

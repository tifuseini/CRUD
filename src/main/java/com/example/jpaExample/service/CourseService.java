package com.example.jpaExample.service;

import com.example.jpaExample.model.Course;

import java.util.Optional;

public interface CourseService {

    Course createCourse(Course course);

    Optional<Course> getCourseById(Long id);

    Iterable<Course> getCoursesByCategory(String category);

    Iterable<Course> getAllCourses();

    void updateCourse(Course course);

    void deleteCourseById(Long id);

    void deleteAllCourses();
}

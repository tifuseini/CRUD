package com.example.jpaExample.serviceImpl;

import com.example.jpaExample.exception.CourseNotFoundException;
import com.example.jpaExample.model.Course;
import com.example.jpaExample.repository.CourseRepository;
import com.example.jpaExample.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public Iterable<Course> getCoursesByCategory(String category) {
        return courseRepository.findAllByCategory(category);
    }

    public Iterable<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public void updateCourse(Long id,Course course) {
        courseRepository.findById(id).map(dbcourse -> {
            dbcourse.setName(course.getName());
            dbcourse.setCategory(course.getCategory());
            dbcourse.setRating(course.getRating());
            dbcourse.setDescription(course.getDescription());
            return courseRepository.save(dbcourse);
        }).orElseThrow(() ->
                new CourseNotFoundException(String.format("Course with id %d not available", id)));
    }

    public void deleteAllCourses(){
        courseRepository.deleteAll();
    }

    public void deleteCourseById(Long id) {
        courseRepository.findById(id).map(dbcourse -> {
            courseRepository.delete(dbcourse);
            return dbcourse;
        }).orElseThrow(() ->
                new CourseNotFoundException(String.format("{Course with id %d not available}", id)));
    }


}

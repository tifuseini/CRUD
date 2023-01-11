package com.example.jpaExample.controller;

import com.example.jpaExample.model.Course;
import com.example.jpaExample.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/course")
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/")
    public Course createCourse(Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping("/")
    public Iterable<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id).get();
    }

    @GetMapping("/category/{name}")
    public Iterable<Course> getCoursesByCategory(@PathVariable String name) {
        return courseService.getCoursesByCategory(name);
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course) {
        courseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable Long id) {
        courseService.deleteCourseById(id);
    }

    @DeleteMapping("/")
    public void deleteAllCourses() {
        courseService.deleteAllCourses();
    }


}

package com.example.jpaExample.controller;

import com.example.jpaExample.model.Course;
import com.example.jpaExample.service.CourseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/course")
@Tag(name = "Course", description = "Course API")
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a course")
    public Course createCourse(Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Get all courses")
    public Iterable<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Get course by id")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id).get();
    }

    @GetMapping("/category/{name}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Get courses by category")
    public Iterable<Course> getCoursesByCategory(@PathVariable String name) {
        return courseService.getCoursesByCategory(name);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Update course by id")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course) {
        courseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete course by id")
    public void deleteCourseById(@PathVariable Long id) {
        courseService.deleteCourseById(id);
    }

    @DeleteMapping("/")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete all courses")
    public void deleteAllCourses() {
        courseService.deleteAllCourses();
    }


}

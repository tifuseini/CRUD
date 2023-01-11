package com.example.jpaExample;

import com.example.jpaExample.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@Slf4j
class JpaExampleApplicationTests {

	@Autowired
	private  MockMvc mockMvc;
	@Autowired
	private  CourseService courseService;


	@Test
	void contextLoads() {
		log.info("Hello World");
		var course = courseService.getAllCourses();
		log.info("Course: {}", course);
	}



}

package com.example.jpaExample;

import com.example.jpaExample.model.Course;
import com.example.jpaExample.service.CourseService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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


	@Test
	public void testPostCourse() throws Exception{
		Course course = Course.builder()
				.name("Java")
				.category("Programming")
				.rating(5)
				.description("Java Programming")
				.build();

		var objectMapper = new ObjectMapper();

		;

		var response = mockMvc.perform(post("/api/v1/course/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(course)))
				.andDo(print())
				.andExpect(jsonPath("$.name").value("Java"))
				.andExpect(jsonPath("$.category").value("Programming"))
				.andExpect(jsonPath("$.rating").value(5))
				.andExpect(jsonPath("$.description").value("Java Programming"))
				.andExpect(status().isCreated())
				.andReturn()
				.getResponse();

		Integer id = JsonPath.parse(response.getContentAsString()).read("$.id");
		assert id != null;

		log.info("Response: {}", response);

	}



}

package com.example.jpaExample;

import com.example.jpaExample.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@RequiredArgsConstructor
class JpaExampleApplicationTests {

	private final CourseService courseService;

	private final MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

}

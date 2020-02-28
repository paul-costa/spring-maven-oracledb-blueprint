package at.paulcosta.springmavenstarter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:applications-integrationtest.properties")
class SpringMavenStarterApplicationTests {

	@Test
	void contextLoads() {
	}

}

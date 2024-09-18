package com.example.PostgreCRUD;

import com.example.PostgreCRUD.repository.EmployeeRepository;
import com.example.PostgreCRUD.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
class PostgreCrudApplicationTests {

	private EmployeeRepository repository;
	@Test
	void contextLoads() {
	}
	}
}

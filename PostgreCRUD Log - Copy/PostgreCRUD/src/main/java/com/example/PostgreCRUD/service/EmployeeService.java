package com.example.PostgreCRUD.service;

import com.example.PostgreCRUD.model.Employee;
import com.example.PostgreCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

     Logger logger = LogManager.getLogger(EmployeeService.class);

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        try {
            return employeeRepository.findAll();
        } catch (Exception e) {
            logger.error("Error retrieving employees: ", e);
            throw new RuntimeException("Error retrieving employees");
        }
    }

    public Employee createEmployee(Employee employee) {
        try {
            return employeeRepository.save(employee);
        } catch (Exception e) {
            logger.error("Error creating employee: ", e);
            throw new RuntimeException("Error creating employee");
        }
    }

    public Employee getEmployeeById(long id) {
        try {
            Optional<Employee> employeeOptional = employeeRepository.findById(id);
            if (employeeOptional.isPresent()) {
                return employeeOptional.get();
            } else {
                logger.warn("Employee not found with id: " + id);
                throw new RuntimeException("Employee not found with id: " + id);
            }
        } catch (Exception e) {
            logger.error("Error retrieving employee with id {}: ", id, e);
            throw new RuntimeException("Error retrieving employee");
        }
    }

    public Employee updateEmployee(long id, Employee employeeDetails) {
        try {
            Optional<Employee> employeeOptional = employeeRepository.findById(id);
            if (employeeOptional.isPresent()) {
                Employee employee = employeeOptional.get();
                employee.setFirstName(employeeDetails.getFirstName());
                employee.setLastName(employeeDetails.getLastName());
                employee.setEmailId(employeeDetails.getEmailId());

                return employeeRepository.save(employee);
            } else {
                logger.warn("Employee not found with id: " + id);
                throw new RuntimeException("Employee not found with id: " + id);
            }
        } catch (Exception e) {
            logger.error("Error updating employee with id {}: ", id, e);
            throw new RuntimeException("Error updating employee");
        }
    }

    public void deleteEmployee(long id) {
        try {
            Optional<Employee> employeeOptional = employeeRepository.findById(id);
            if (employeeOptional.isPresent()) {
                employeeRepository.delete(employeeOptional.get());
            } else {
                logger.warn("Employee not found with id: " + id);
                throw new RuntimeException("Employee not found with id: " + id);
            }
        } catch (Exception e) {
            logger.error("Error deleting employee with id " + id + ": ", e);
            throw new RuntimeException("Error deleting employee");
        }
    }
}

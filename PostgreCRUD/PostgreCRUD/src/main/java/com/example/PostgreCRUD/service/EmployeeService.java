package com.example.PostgreCRUD.service;

import com.example.PostgreCRUD.model.Employee;
import com.example.PostgreCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow();

    }

    public Employee updateEmployee(long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow();


        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();


        employeeRepository.delete(employee);
    }
}

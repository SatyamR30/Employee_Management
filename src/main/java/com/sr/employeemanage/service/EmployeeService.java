package com.sr.employeemanage.service;

import com.sr.employeemanage.model.Employee;
import com.sr.employeemanage.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found with id " + id));
    }

    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    public Employee updateEmployee(Long id, Employee updatedemp) {
        Employee existing = getEmployeeById(id);
        existing.setFirstname(updatedemp.getFirstname());
        existing.setLastname(updatedemp.getLastname());
        existing.setEmail(updatedemp.getEmail());
        return employeeRepository.save(existing);
    }

    public void deleteEmployee(Long id) {
        Employee existing = getEmployeeById(id);
        employeeRepository.delete(existing);
    }
}

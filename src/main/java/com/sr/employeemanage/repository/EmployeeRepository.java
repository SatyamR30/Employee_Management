package com.sr.employeemanage.repository;

import com.sr.employeemanage.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

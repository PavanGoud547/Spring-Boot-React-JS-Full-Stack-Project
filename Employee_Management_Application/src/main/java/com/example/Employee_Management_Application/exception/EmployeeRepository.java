package com.example.Employee_Management_Application.exception;

import com.example.Employee_Management_Application.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

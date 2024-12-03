package com.example.Employee_Management_Application.repository;

import com.example.Employee_Management_Application.dto.EmployeeDto;

import java.awt.*;
import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);


    List<EmployeeDto> getAllEmployees();
}

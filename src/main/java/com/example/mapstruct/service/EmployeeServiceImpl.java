package com.example.mapstruct.service;

import com.example.mapstruct.entity.Employee;
import com.example.mapstruct.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}

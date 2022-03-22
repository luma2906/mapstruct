package com.example.mapstruct.service;

import com.example.mapstruct.entity.Employee;
import com.example.mapstruct.repository.IEmployeeRepository;
import com.example.mapstruct.repository.IEmployeeV2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeV2Repository IEmployeeRepository;
    @Override
    public Iterable<Employee> getAll() {
        return IEmployeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return IEmployeeRepository.save(employee);
    }
}

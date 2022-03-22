package com.example.mapstruct.service;

import com.example.mapstruct.entity.Employee;

public interface IEmployeeService {
     Iterable<Employee> getAll();
     Employee save(Employee employee);
}

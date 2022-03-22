package com.example.mapstruct.repository;

import com.example.mapstruct.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}

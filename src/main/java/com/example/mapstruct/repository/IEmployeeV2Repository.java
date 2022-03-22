package com.example.mapstruct.repository;

import com.example.mapstruct.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeV2Repository extends JpaRepository<Employee,Long> {
}

package com.example.mapstruct.service.employee;

import com.example.mapstruct.model.Employee;
import com.example.mapstruct.repository.IEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {
    EmployeeServiceImpl employeeServiceImpl;
    @Test
    void get_employee_when_call_find_all() {
        // Arrange
        IEmployeeRepository iEmployeeRepository = Mockito.mock(IEmployeeRepository.class);
        employeeServiceImpl = new EmployeeServiceImpl(iEmployeeRepository);
        // Act
        employeeServiceImpl.getAll();

        // Assert
        verify(iEmployeeRepository).findAll();
    }
    @Test
    void create_employee_when_call_save() {

        IEmployeeRepository iEmployeeRepository = Mockito.mock(IEmployeeRepository.class);
        employeeServiceImpl = new EmployeeServiceImpl(iEmployeeRepository);
        Employee employee = new Employee();
        employeeServiceImpl.save(employee);
        verify(iEmployeeRepository).save(employee);
    }
}
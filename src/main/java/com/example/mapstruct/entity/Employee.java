package com.example.mapstruct.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String position;
    private Integer years;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String cargo) {
        this.position = cargo;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer edad) {
        this.years = edad;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salario) {
        this.salary = salario;
    }
}

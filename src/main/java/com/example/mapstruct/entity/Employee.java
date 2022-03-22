package com.example.mapstruct.entity;

import javax.persistence.*;

@Entity
@Table(name= "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_employee")
    private Long id;
    private String name;
    private String position;
    private Integer years;
    private Integer salary;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

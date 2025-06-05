package com.sr.employeemanage.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "employees")


public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;
    @NotNull
    @Size(min = 2, max = 100)
    private String firstname;

    @NotNull
    @Size(min = 2, max = 100)
    private String lastname;

    @Email
    @NotNull
    private String email;

    public Employee() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {this.id = id;}

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {this.email = email;}
}

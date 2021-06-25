package com.meteo.employee_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "inn")
    private Long inn;
    @Column(name = "inps")
    private Long inps;
    @Column(name = "passport_no")
    private String passportNo;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "phone_no")
    private String phoneNo;
}
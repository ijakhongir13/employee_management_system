package com.meteo.employee_management_system.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
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
    @Column(name = "work_department")
    private String workDepartment;
    @Column(name = "work_position")
    private String workPosition;
    @Column(name = "edu_institution")
    private String eduInstitution;
    @Column(name = "edu_country")
    private String eduCountry;
    @Column(name = "edu_speciality")
    private String eduSpeciality;
    @Column(name = "edu_type")
    private String eduType;
    @Column(name = "edu_addmission_date")
    private String eduAdmissionDate;
    @Column(name = "edu_graduation_date")
    private String eduGraduationDate;
    @Column(name = "edu_diploma_specs")
    private String eduDiplomaSpecs;
    @Column(name = "marital_status")
    private String maritalStatus;
}
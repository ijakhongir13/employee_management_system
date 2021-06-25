package com.meteo.employee_management_system.service;
import com.meteo.employee_management_system.model.Employee;
import com.meteo.employee_management_system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id){
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()){
            employee = optional.get();
        } else {
            throw new RuntimeException("Нет сотрудника с id: " + id);
        }
        return employee;
    }
}
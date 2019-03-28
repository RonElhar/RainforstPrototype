package com.rainforest.dao;

import com.rainforest.model.Employee;

import java.util.List;


public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public Employee findeEmployeeById(int id);

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
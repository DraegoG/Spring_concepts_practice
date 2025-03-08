package com.example.demo1.service;

import com.example.demo1.beanScope.RequestBeanScopeExample;
import com.example.demo1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    RequestBeanScopeExample requestBeanScopeExample;

    List<Employee> employeeList = new LinkedList<>();

    public String addEmployee(Employee employee) {
        employeeList.add(employee);
        requestBeanScopeExample.callUpdated();
        return "{ \"message:\": \"Employee added successfully\"}";
    }
}

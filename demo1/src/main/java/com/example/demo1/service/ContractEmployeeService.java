package com.example.demo1.service;

import com.example.demo1.beanScope.SessionBeanScopeExample;
import com.example.demo1.model.ContractEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ContractEmployeeService {
    List<ContractEmployee> ls = new LinkedList<>();

    @Autowired
    SessionBeanScopeExample sessionBeanScopeExample;

    public String addContractEmployee(ContractEmployee contractEmployee){
        ls.add(contractEmployee);
        sessionBeanScopeExample.updateDetails();
        return "{ \"message\": \"Contract employee details added successfully\"}";
    }

}

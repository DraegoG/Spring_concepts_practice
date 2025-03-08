package com.example.demo1.controllers;

import com.example.demo1.model.ContractEmployee;
import com.example.demo1.service.ContractEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Added this controller to create example of the session scope
@RestController
@RequestMapping("/contractEmployee")
public class ContractEmployeeController {

    @Autowired
    ContractEmployeeService contractEmployeeService;

    @PostMapping("/add")
    public ResponseEntity<String> addContractEmployee(@RequestBody ContractEmployee contractEmployee) {
        String response = contractEmployeeService.addContractEmployee(contractEmployee);
        return ResponseEntity.status(200).body(response);
    }

}

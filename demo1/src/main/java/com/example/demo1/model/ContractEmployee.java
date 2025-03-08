package com.example.demo1.model;


public class ContractEmployee {

    int id;
    String name;
    int age;

    public ContractEmployee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printContractEmployeeHashCode() {
        System.out.println("The employee hashcode:" + this.hashCode());
    }

}

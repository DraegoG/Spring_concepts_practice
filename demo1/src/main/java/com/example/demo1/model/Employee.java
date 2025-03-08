package com.example.demo1.model;

public class Employee {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printEmployeeHashCode() {
        System.out.println("The employee hashcode:" + this.hashCode());
    }
}

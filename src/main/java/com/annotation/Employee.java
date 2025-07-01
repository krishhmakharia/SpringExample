package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int employee_id;
    //Value annotaion
    @Value("Hello")
    private String fname;
    @Value("${java.home}")
    private String lname;
    @Value("#{4*2}")
    private double salery;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salery=" + salery +
                '}';
    }
}

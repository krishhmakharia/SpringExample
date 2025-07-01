package com.annotationAutowireExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("#{1}")
    private int empId;
    @Value("Krish")
    private String fname;
    @Value("Makharia")
    private String lname;
    @Value("#{1*100000}")
    private double salery;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salery=" + salery +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
}

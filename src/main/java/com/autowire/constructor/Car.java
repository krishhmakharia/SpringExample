package com.autowire.constructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

//    public void setSpecification(Specification specification) { //No need
//        this.specification = specification;
//    }


    public void displayDetails(){
        System.out.println("Car Details:"+specification.toString());
    }

}

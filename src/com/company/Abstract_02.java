//package com.company;
//public class Abstract_02 {
//    public static void main(String[] args) {
////        Vehicle v=new Vehicle(); //Vehicle' is abstract; cannot be instantiated
//        System.currentTimeMillis() ;
//         Car mycar = new Car();
//         Parent p=new Child();
//         mycar.getPrice();
//         mycar.getColor();
//         mycar.Start();
//         mycar.getSum();
//        p.getSum();
//    }
//}
//
//abstract  class Vehicle {
//    private int a=12;
//    private int b=23;
//    abstract void Start();
//   abstract void getColor();
//   abstract void getPrice();
//
//   abstract  void getSum();
//}
//
//class Car {
//
//    void getPrice() {
//        System.out.println("Car price is" + 22 + "lacs");
//    }
//
//
//    void Start() {
//        System.out.println("starts with Key");
//    }
//
//    void getColor() {
//        System.out.println("Color is Red");
//    }
//}
//
//class MotorCycle {
//    void getPrice() {
//        System.out.println("MotorCycle price is" + 4 + "lacs");
//    }
//    void getColor() {
//        System.out.println("Color is Green");
//    }
//
//    @Override
//    void Start() {
//        System.out.println("Starts with kick");
//    }
//}
//
//class Parent {
//    private int a=12;
//    private int b=23;
//    void getSum(){
//        System.out.println("Parent Sum is" +(a+b));
//    }
//}
//class Child extends  Parent{
//    void getSum(){
////        System.out.println("Child Sum is"+(a+b+10));
//    }
//}

package com.company.Abstraction;

public class AbstractClass_01 {
    abstract  class Vehicle{
        abstract void color();


        abstract  void Start();
       abstract void getPrice();
    }
    class  Car extends Vehicle{
       void color(){
           System.out.println("Color of A Car is Red");
       }
       void Start(){
           System.out.println("Start whit peg");
       }
       void getPrice(){
           System.out.println("Price of A Car is"+12.33+"lacs");
       }
    }
    public static void main(String[] args) {
        System.out.println("AbstractClass_01 Hello World!");
        AbstractClass_01 main = new AbstractClass_01();
         Car c=main.new  Car();
         c.getPrice();
        c.color();
        c.Start();
        }
    }


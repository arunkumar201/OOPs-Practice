package com.company.Abstraction;


public class Vehicle_Example {

    public static void main(String[] args) {
       Vehicle v=new Car();
        v.Start();
       v.setSpeed(129);
       v.getColor("Blue");
       v.getPrice(28889);
       v.Stop();
       v.getName("Tesla");
         final int i =85;
        System.out.println(i);
    }
}
abstract class Vehicle{
    int num_Of_Tyres;
    abstract void getColor(String color);
    abstract void Start();
    abstract void Stop();
    abstract void setSpeed(int speed);
    abstract void getPrice(int price);

    void getName(String name){
        System.out.println("Current Car Name : "+name);
    }
}


class Car extends Vehicle{
    public  void num_Of_Tyres(int num_Of_Tyres){
        System.out.println("Car Has " + num_Of_Tyres+" Tyres");
    }
    void Start() {
        System.out.println("Car is Start via Using Key");
    }
    void Stop() {
        System.out.println("Car is Stop via Using Key");
    }
    void setSpeed(int speed) {
        System.out.println("Current Car Speed: " + speed);
    }
    void getPrice(int price) {
        System.out.println("Current Car Price: $" + price);
    }
    void getColor(String color) {
        System.out.println("Current Car Color: " + color);
    }

}


package com.company.Abstraction;

import org.w3c.dom.ls.LSOutput;

public class Abstract_03 {

    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.getName("Arun");
        e1.getAge(12);

    }
}
      abstract class Employee {
        public String name;
      abstract public String getName(String name);
      public void getAge(int age){
          System.out.println("My Age in Abstract is " +age);
      }
    }
    class Emp extends Employee {
        public String getName(String name) {
            System.out.println("My Name: " + name);
            return name;
        }
    }



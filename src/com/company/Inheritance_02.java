package com.company;


public class Inheritance_02 {
    protected  int a=23;
    protected int b=32;
    void displayMessage(String message){
        System.out.println ("Message is:"+message);
    }
    static class Child extends  Inheritance_02{

        void GetDetails(String msg) {
            System.out.println ( "Sum of " + a + " and " + b + " is: " + (a + b) );
            displayMessage (msg);
        }
        


    }
    public static void main ( String[] args ) {
        Child child=new Child();
        String name="Arun Kumar";
        child.GetDetails(name);
        child.displayMessage(name);
    }
}

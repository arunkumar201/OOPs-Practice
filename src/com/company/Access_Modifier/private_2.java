package com.company.Access_Modifier;

import org.w3c.dom.ls.LSOutput;

class Simple {
    private  int data=40;
    private String  name="Nilesh Bhai";
     void msg(){System.out.println("Hello java");}
//    private_2 obj3=new private_2 ();
//    we can't create  an object of Private_2 class in Another Class
//        becouse We are declared a Private_2 constructor as private'
    void SetName(String name){
          this.name=name;
    }
    String getName(){
         return this.name;
    };
}


public class private_2 {

   private_2 (){

     }
    public static void main(String args[]){
        Simple obj=new Simple ();
//        System.out.println(obj.data);//Compile Time Error
//        obj.msg();//Compile Time Error
        obj.SetName ( "Arun Kumar" );
        System.out.println (obj.getName());
    }

}

package com.company.Basics_Of_OOPs;

public class Intialize_Object_3Ways {

   static class Student{
       String name;
       int roll;

       void getName(String stu_Name,int rollno){
           name=stu_Name;
           roll=rollno;
       }
       void Display(){
           System.out.println ("Student Name is:" +
                   name+"\n Student Enrollment Number is:" +roll);
       }

    }

    public static void main ( String[] args ) {
        Student st1=new Student ();
        Student st2=new Student();
        st1.getName ( "arun",7008);
        st2.getName ( "ramu",7009);
        st1.Display ();
        st2.Display ();



    }



}

package com.company.Access_Modifier;
public class Default_1 {
    int a=232;
    int b=34;

    int display(){
        return a+b;
    }

    public static void main ( String[] args ) {
        Main obj2= new Main ();
        System.out.println(obj2.name);
    }
 }
class Main {
    public static String name="Arun Kumar";

    public static void main ( String[] args ) {
        Default_1 obj1 = new Default_1 ();
        int x = obj1.display ();
         name="Arun Kumar";
        System.out.println (x);
        System.out.println ( obj1.a+obj1.b);

    }

}

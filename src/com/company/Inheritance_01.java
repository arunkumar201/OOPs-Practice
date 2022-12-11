package com.company;

class P{
    int a=23;
    int b=2;

    public void GetSum(){
        System.out.println (a+b);
    }
}
class C extends P
{
    public void GetMul(){
        System.out.println(a*b);


    }

}
public class Inheritance_01 {
    public static void main ( String[] args ) {

        P p = new P();
        C c = new C();
        c.GetSum ();
        c.GetMul();
    }

}

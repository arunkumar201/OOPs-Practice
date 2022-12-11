public class MethodOverriding1 {
   static  class Parent {
       static int a=12;
       Object m1 () {
           System.out.println ( "Method m1 in Class Parent" );
           return null;
       }
   }
   static class Child extends Parent{

     @Override
       String m1(){

           System.out.println ("Method m1 in Class Child");
           return "ahdh";
       }
       void m2(){
           System.out.println ("Method m1 in Class Child");
       }
   }
   static class D extends Child{
      @Override
       void m2(){
//        System.out.println(a.super);
           System.out.println ("Method m2 in class D");
       }
   }


    public static void main ( String[] args ) {
        Parent p=new Parent ();
        Parent c=new Child ();
        Child x= new D();
        p.m1();
        c.m1();
        x.m2();

    }
}

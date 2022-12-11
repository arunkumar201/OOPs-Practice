public class OverridingMethod {
   static class Parent{

       private void m1(){
           System.out.println ("Method m1 in class Parent (Private)");
       }
   }
   static class Child extends Parent{
//       @Override
       private void m1(){
           System.out.println ("Method 1 in Class Child");
       }
   }

 static   class P{
        void me1(){
           System.out.println ("This is a Final Method");
       }

   }
   static class C extends P{
      @Override
       final void me1(){
           System.out.println ("This is non final method in child class ");
       }
   }
    public static void main ( String[] args ) {
        Parent p=new Parent();
        p.m1 ();
        Parent ch=new Child ();
        ch.m1();

        Child ch1=new Child ();
        ch1.m1();

    }
    }



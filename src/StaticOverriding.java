public class StaticOverriding {

    public  void m1(){
        System.out.println ("This is a Static or class level method");

    }
    static  class Child extends StaticOverriding{
//      Compile time Error
//        public  void m1(){
//            System.out.println ("This is an Object Level or non static method");
//        }
//        @Override
        //here the m1() method is not overriding
        //it is a method hiding

        @Override
        public  void m1(){
            System.out.println ("This is also a class level method");
            super.m1();

        }

    }

    public static void main ( String[] args ) {
        StaticOverriding s=new StaticOverriding();
        s.m1();
        Child c=new Child ();
        c.m1();

    }
}

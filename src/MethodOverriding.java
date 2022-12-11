public class MethodOverriding {
   static  class Parent
    {   int a;
        public void m1(int a) {
          System.out.println ( "Method m1 in Class P :"+a);
        }
        public void m2() {
            System.out.println ( "Method m2 in Class P");
        }
    }
   static class Child extends Parent{
        @Override
        public void m1(int a)
        {
            System.out.println ("Method m1 in Child Class "+a);
        }
        @Override
        public void m2()
        {
            System.out.println ("Method m2 in Child Class ");
        }
    }

    public static void main ( String[] args ) {
              Parent p=new Parent();
              p.m1(5);
              p.m2 ();
              Parent p1=new Child ();
              p1.m2 ();
              p1.m1 (6);


    }
}

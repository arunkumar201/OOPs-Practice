public class ScopeOverriding {

    static  class P{
            void m1() throws Exception
            {
            System.out.println ("Method m1 with private scope");
        }
    }
   static class ChildClass extends P {
       @Override
       void m1 () throws Exception{
           System.out.println ( "Method m1 with private scope" );
       }
   }

    public static void main ( String[] args ) {

    }
}

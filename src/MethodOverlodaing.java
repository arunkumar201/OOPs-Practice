public class MethodOverlodaing {


    public static void main ( String[] args ) {
        MethodOverlodaing a=new MethodOverlodaing ();

        a.add(12,23);
        a.add(12.5,23);
        a.add(12.5,23.5);
    }
    void add(int a ,int b){
        System.out.println (a+b);
    }
    void add(double a ,int b){
        System.out.println (a+b);
    }

    void add(double a ,double b){
        System.out.println (a+b);
    }


}

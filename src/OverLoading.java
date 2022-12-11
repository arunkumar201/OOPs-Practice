public class OverLoading {

    public static void main(int a,int b){
        System.out.println (a+b);
    }
    public static void main(int a){
        System.out.println (a);
    }
    public static void m1(){
        System.out.println ("No arguments Method");
    }
    public static void main(int a,float b){
        System.out.println (a+b);
    }
    void m1(int ch){
        System.out.println (ch);
    }
    void m1(char ch){
        System.out.println (ch);
    }
    void m1(float ch){
        System.out.println (ch);
    }
    public static void main ( String[] args ) {

        main(12,34);
        main(12,34);
        OverLoading obj=new OverLoading();
        obj.m1 ( 12);
        obj.m1('g');
        obj.m1(235f);
        obj.main('a');

    }
}

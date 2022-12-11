public class PromationOverLoading {
    static  void m1(int a){
        System.out.println (a);
    }
    static  void m1(float a){
        System.out.println (a);
    }
//    static  void m1(){
//        System.out.println (a);
//    }
//    static  void m1(int a){
//        System.out.println (a);
//    }
//    static  void m1(int a){
//        System.out.println (a);
//    }
//    static  void m1(int a){
//        System.out.println (a);
//    }


    public static void main ( String[] args ) {
        m1(120);
        m1(23.5f);
//        m1(12.4);
        m1('a');
        m1(11323l);

    }
}

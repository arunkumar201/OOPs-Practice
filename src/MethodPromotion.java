public class MethodPromotion {
    public static void main ( String[] args ) {

        m1(45L);
        m1(12,'a');
        m2((byte)2);
        m3(new Object ());
//        m3("Arun");
        m3(null);

//        m4("Arun");
        m4(new StringBuffer ("Arun"));
//        m4('5');
        m5 ( 12,21.4f );
        m5 ( 12f,21);
//        m5(10,10);
        m5('c',45f);

    }

    static void m5(int n,float n1){
        System.out.println("Int>>Float type Method ");
    }
    static void m5(float n1,int n){
        System.out.println("float>>int type Method ");
    }

    static void m1(int n){
        System.out.println("Int type Method and value is "+n);
    }
    static void m1(float n){
        System.out.println("Int type Method and Char type:" +" Integer  "+ n +" Char value "+n);
    }

    static void m1(float n,int ch){
        System.out.println("double type Method and value is "+n);
    }
    static void m2(short n){
        System.out.println("short type Method and value is "+n);
    }

    static void m3(Object n){
        System.out.println("Object type Method and value is "+n);
    }
//    static void m3(String n){
//        System.out.println("String type Method and value is "+n);
//    }
//
static void m4(StringBuffer n){
    System.out.println("StringBuffer type Method and value is "+n);
}
static void m4(String n){
        System.out.println("String type Method and value is "+n);
    }

 

}


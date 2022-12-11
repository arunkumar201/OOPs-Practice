class Child extends SuperKey{
    int a=88;
    void Display(){
        System.out.println ("This is method inside a sun Class/child/derived Class");
        System.out.println("Access a from same/child Class Without Super Key:"+a);
        System.out.println("Access  value of 'a' from Super/parent/base Class WithSuper Key:"+ super.a);
        System.out.println("Access  value of 'Display Method'  With Super Key");
        super.Display();



    }
}

 class SuperKey2nd{

}

public class SuperKey {
        int a=90;
        void Display(){
            System.out.println ("This is method inside a Super Class/parent/Base Class");
        }

    public static void main ( String[] args ) {
      Child c=new Child ();
        SuperKey c1=new Child ();
//         Child ch1=  new SuperKey();
        c.Display ();
        c1.Display ();

    }
}


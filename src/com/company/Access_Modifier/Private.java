package com.company.Access_Modifier;

public class Private {
   private   String str="Arun KUmar";
  private   String Enroll="190120107008";
  private  int a=33;
    private  void Display_Info(){
        System.out.println("My name is:"+str);
        System.out.println("My EnrollmentNumber:"+Enroll);
    }
  private  void Display_Info(String str,String Enroll){
               this.str=str;
               this.Enroll=Enroll;
      System.out.println("My name is:"+str);
              System.out.println("My EnrollmentNumber:"+Enroll);
    }
//
//      private static class My_Data{
//
//        void  get_Data(){
//            System.out.println (this.str+" "+this.Enroll);
//        }
    public static void main ( String[] args ) {
        Private obj1=new Private ();

        System.out.println (obj1.Enroll);
        System.out.println (obj1.str);
        System.out.println (obj1.a);
        obj1.Display_Info ();

        obj1.Display_Info ("ramu","1901");


    }
}

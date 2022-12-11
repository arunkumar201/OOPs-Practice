package com.company;

    class Account_Details {

        String Acc_Holdername;
         long Account_Number;
        private double Account_Balance=0;

        //get Method to access the private Members
        public String getAcc_Holdername ( String name, long Acc_Num ) {
            //we have to authorize the user first
            if (Acc_Num == Account_Number) {
                return Acc_Holdername;
            } else {
                return "Access Denied";
            }
        }

        public double get_Account_Balance ( long Acc_Num ) {

            if (Acc_Num == Account_Number) {
                return Account_Balance;
            } else {
                return -1;
            }
        }
            public void set_Account_Balance(double Acc_Balance, long Acc_Num ) {
                if (Acc_Num == Account_Number){
                    Account_Balance+=Acc_Balance;
                }

            }
        }

public class Data_Hiding {
    public static void main ( String[] args ) {
        Account_Details ac=new Account_Details();
        ac.Acc_Holdername="Arun";
        ac.Account_Number=3553553;

        double bal=ac.get_Account_Balance (3553553);
        System.out.println ("My Account Balance is "+bal);

        ac.set_Account_Balance ( 100000,3553553 );
        double bal1=ac.get_Account_Balance (3553553);
        System.out.println ("My Account Balance is "+bal1);
        ac.set_Account_Balance ( 200000,3553553 );
        System.out.println ("My Account Balance is "+ac.get_Account_Balance (3553553));




    }
}










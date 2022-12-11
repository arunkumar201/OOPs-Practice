package com.company.Basics_Of_OOPs;

public class object {

    public static void main ( String[] args ) {

    Book book1=new Book(520);
    book1.Read ();
    book1.Write ();
        System.out.println ("Height of My book is" +
                ":"+book1.Height);
        System.out.println ("MY Book Name is::"+book1.Name);
        System.out.println ("Total number of PAges are:"+book1.GetBookPages());


        }
    }
class Book {

    int book_Pages;
   Book(int n){
       this.book_Pages= n;

   }

    //Identity of a Book
    String Name="JAVA OPPs";

    //properties/States of an object
    int Weight=1;
    int Height=2;
    //Methods or Functionalities
    void Read(){
        System.out.println ("Reading a Book of OOPs");
    }
    void Write(){
        System.out.println ("Writing a Book");
    }
    int GetBookPages(){
        return book_Pages;
    }

}


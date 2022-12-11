public class Polymorphism {
    static class Animal{

        void Animal_Sound(){
            System.out.println ("Animal also have or makes sound");
        }
    }

   static class Cat extends Animal{
        void Animal_Sound(){
            System.out.println ("Cat Sound:'Meow meow'");
        }
    }
   static class Dog extends Animal{
        void Animal_Sound(){
            System.out.println ("Cat Sound:'Bow Bow'");
        }
    }
   static class Cow extends Animal{
        void Animal_Sound(){
            System.out.println ("Cat Sound:'low mooo'");
        }
    }

    public static void main ( String[] args ) {
      Animal an=new Animal();
        Animal DogAn=new Dog();
        Animal CatAn=new Cat();
        Animal CowAn=new Cow();

        an.Animal_Sound();
        CatAn.Animal_Sound();
        DogAn.Animal_Sound();
        CowAn.Animal_Sound();
    }
}

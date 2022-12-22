package Interfaces_Intro;
interface CakeBakingService{
    public void mixIngredients();

    public static void bakeCake() {

    }

    private void frostCake() {

    }

}
public class Interface_Intro1 implements  CakeBakingService {
   public void mixIngredients(){
       System.out.println("THis is a MixIngredients Service");
    }
    public void bakeCake(){
        System.out.println("THis is a Bake Cakes Service");
    }
    private void frostCake() {
        System.out.println("This is  the frost Cakes Service");
    }
    public static void main(String[] args) {
        Interface_Intro1 obj1=new Interface_Intro1();
        obj1.bakeCake();
        obj1.frostCake();
        obj1.mixIngredients();
    }
}


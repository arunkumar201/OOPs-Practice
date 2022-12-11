public class Ploymorphism1 {
    static class Shape {
        double getArea () {
            return 0.0;
        }
    }
   static class Circle extends Shape{
            double r;
            Circle(double radius){
                this.r=radius;
            }
            double getArea(){
                return 3.14*r*r;
            }
        }

    static class Rectantagle extends Shape{
        double width,height;
        Rectantagle(double width,double height){
            this.width=width;
            this.height=height;
        }
        double getArea(){
            return height*width;
        }
    }



    public static void main ( String[] args ) {
//        Shape s=new Shape ();
        Shape cir=new Circle(3);
        Shape rect=new Rectantagle(5,2);
        double circle_area=cir.getArea();
        System.out.println ("Area of Circle is:"+circle_area);

        double rectangle_area=rect.getArea();
        System.out.println ("Area of Rectantagle is:"+rectangle_area);

    }

}

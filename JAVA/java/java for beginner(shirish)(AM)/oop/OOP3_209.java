public class OOP3_209 {
    public static void main(String[] args){
        Shape C1 = new Shape(5);
        Shape C2 = new Shape(7);
        System.out.println("the area of the 1st circle is "+C1.area_c());
        System.out.println("the area of the 2nd circle is "+C2.area_c());

        Shape R1 = new Shape(22,40);
        Shape R2 = new Shape(16,30);
        System.out.println("the area of the 1st rectangle is "+R1.area_r());
        System.out.println("the area of the 2nd rectangle is "+R2.area_r());
    }
}
class Shape{
    double radius;
    double height;
    double width;
    Shape(double radius){
        this.radius = radius;
    }
    Shape(double height,double width){
        this.height = height;
        this.width = width;
    }
    double area_c(){
        return 3.1415d * this.radius * this.radius;
    }
    double area_r(){
        return height*width;
    }
}
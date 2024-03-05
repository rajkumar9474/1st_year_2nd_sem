//write a program to comput the volumes of spheres and rectangle block. create an instantiable class Shapes that would contain an overloaded constructor . For a sphere, only radius would be passed to constructor, and for a rectangluar block, length,width and height would be passed to the constructor. create a startup class VolumeShapes that would create the required objects. find the voulmes of two shperes with 100 and 12. find the volumes of two trctangular blocks with length, width,a dn height 20,21,22 for 1st and 25,27,30 for the 2nd


public class OOP4_209 {
    public static void main(String[] args){
        Shape2 c1 = new Shape2(10);
        Shape2 c2 = new Shape2(12);
        Shape2 r1 = new Shape2(20,21,22);
        Shape2 r2 = new Shape2(25,27,30);
        c1.voulm_s();
        c2.voulm_s();
        r1.voulm_r();
        r2.voulm_r();
    }
}
class Shape2{
    double red;
    Shape2(double red){
        this.red = red;
    }
    double length;
    double height;
    double width;
    Shape2(double length,double height,double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }
    void voulm_s(){
        double vol = 1.33d*3.1415d*this.red*this.red;
        System.out.println("the volume of the sphere is "+vol);
    }
    void voulm_r(){
        double vol = this.length * this.height * this.width;
        System.out.println("the volume of the rectangle is "+vol);

    }

}
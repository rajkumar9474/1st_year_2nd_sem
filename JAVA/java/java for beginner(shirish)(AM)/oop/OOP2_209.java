/// write a program to compute the are of three triangles . forst triangle with base and height 12 and 18 ; and secind trianlge with base and height 14 and 22;and the third trianlge with base and height 16 and 20 respectively / create an instatiable class Tringle that would contain instance varable base and height , a constructor to initialize the object's base and height , and a methode area() that would compute and return the area of trianlge / create a startup class AreaTrianlge in which create the three objects r1,r2,r3 of class trang .



public class OOP2_209 {
    public static void main(String[] args){
        Trangle t1 = new Trangle(12,18);
        System.out.println("the area of the first trianlge is "+t1.area());
        Trangle t2 = new Trangle(14,22);
        System.out.println("the area of the second trianlge is "+t2.area());
        Trangle t3 = new Trangle(16,20);
        System.out.println("the area of the third trianlge is "+t3.area());
    }
}

class Trangle{
    int base;
    int height;
    Trangle(int base,int height){
        this.base = base;
        this.height = height;
    }

    double area(){
        return (0.5*base*height);
    }
}



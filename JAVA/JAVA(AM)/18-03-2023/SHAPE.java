import java.util.Scanner;

public class SHAPE{
    public static void main(String []args){
        System.out.println("hello world");


        // circle obj1 = new circle();
        // obj1.cal_area();

        // triangle obj2 = new triangle();
        // obj2.cal_area();

        rectangle obj3 = new rectangle();
        obj3.cal_area();
    }
}

class Shape{
    final float pi = 3.1415926f;
    Scanner scn = new Scanner(System.in);

    float redi(){
        System.out.println("enter the radius:\n ");
        return scn.nextFloat();
    }

    float side(){
        System.out.println("enter the side: ");
        return scn.nextFloat();
    }
}

class circle extends Shape{
    void cal_area(){
        System.out.println("the area of the circle is "+(Math.PI*Math.pow(redi(),2)));
    }
}

class triangle extends Shape{
    void cal_area(){
        float a,b,c,area,s,s1;
        a = super.side();
        b = super.side();
        c = super.side();

        if ((a+b)>c && (b+c)>a && (c+a)>b){

            s = (float) ((a+b+c)/2.0);
            s1 = s*(s-a)*(s-b)*(s-c);
            area = (float) Math.pow(s1,0.5);
            if(area<=0){
                System.out.println("triangle can not be created. ");
            }
            else{
                System.out.println("area is "+area);
            }
        }
        else{
            System.out.println("triangle can not be created. ");
        }

    }
}

class rectangle extends Shape{
    void cal_area(){
    float a,b,area;
        a = super.side();
        b = super.side();
        area = (a*b);
        System.out.println("area is "+area);
    }
}
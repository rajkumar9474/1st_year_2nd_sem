public class SHAPE2 {
    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.cal_area(6);
    }
}

class Shape{
    float s,s1,area;
    void cal_area(float redi){ // to calculate area of a circle
        System.out.println("the area of the circle is "+(Math.PI*Math.pow(redi,2)));
    }
    void cal_area(float side1,float side2){
        System.out.println("area is "+(side1*side2));
    }
    void cal_area(float a,float b,float c){
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
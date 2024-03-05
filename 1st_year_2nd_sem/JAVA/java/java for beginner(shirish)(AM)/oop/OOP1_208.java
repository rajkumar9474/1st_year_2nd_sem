// write a program to compute the area of two rectangle. first rectangle with height and width 10 and 12 ; and second rectangle with height and width 15 and 20 respective;y. create an instantiable class Rect that would contain instance variable height and width, a constructior to initailize the object's height and width, and a method area() that would compute and return the area of rectangle. create a startup class AreaRect in which create the two objects r1 and r2 of class Rect;



public class OOP1_208 {
    public static void main(String[] args){

        
        Rect rec1 = new Rect(10,12);
        Rect rec2 = new Rect(15,20);
        System.out.println("the area of the first rectangle is "+rec1.area());
        System.out.println("the area of the second rectangle is "+rec2.area());
    }

    
}

class Rect{
    int height;
    int width;
    Rect(int height,int width){
        this.height = height;
        this.width = width;
    }
    int area(){
        return (this.height*this.width);
    }
}

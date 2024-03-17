import java.util.Scanner;

public class Inheritance{
    public static void main(String [] args){

        add obj1 = new add();
        obj1.addition();

        sub obj2 = new sub();
        obj2.substraction();

    }
}

class add{
    static int a,b;
    Scanner scn = new Scanner(System.in);
    
    
    void addition(){
        System.out.println("\nthis is addition:  ");
        System.out.println("enter the first number :");
        a = scn.nextInt();

        System.out.println("enter the second number :");
        b = scn.nextInt();

        System.out.println("the addition of those number is : "+(a+b));
    }
}

class sub extends add{
    void substraction(){
        // System.out.println("\nthis is substraction:  ");
        // System.out.println("enter the first number :");
        // a = scn.nextInt();

        // System.out.println("enter the second number :");
        // b = scn.nextInt();

        System.out.println("the substraction of those number is : "+(this.a-this.b));
    }
}
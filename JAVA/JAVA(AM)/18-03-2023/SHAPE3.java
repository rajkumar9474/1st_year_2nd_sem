import java.util.Scanner;

public class SHAPE3 {
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.get_value();
        obj1.display();
        
        B obj2 = new B();
        obj2.sort();

        obj1.display();
        C obj3 = new C();
        obj3.linear();
    }
}
class A{
    Scanner scn = new Scanner(System.in);
    static int arr[] = new int[10];
    void get_value(){
        System.out.println("enter elements : ");
        for(int i = 0;i<10;i++){
            arr[i] = scn.nextInt();
        }
    }

    void display(){
        for(int i = 0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class B extends A{
    void sort(){
        int count = 0;
        do{
            count = 0;
            for(int i = 0;i<10-1;i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    count++;
                }
            }
        }while(count!=0);
    }
}

class C extends B{
    void linear(){
        System.out.println("enter element to search : ");
        int e;
        e = scn.nextInt();
        for(int i = 0;i<10;i++){
            if (arr[i] == e){
                System.out.println("the element is fount at index "+(i+1));
            }
        }
    }
}
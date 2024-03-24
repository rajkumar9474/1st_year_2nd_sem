public class SUPER {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

class Parent{
    Parent(){
        System.out.println("i am in parent!!");
    }
}


class Child extends Parent{
    Child(){
        super();
        System.out.println("i am in child");
    }
    

}

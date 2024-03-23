interface abc{
    void display();
}

class def implements abc{
    public void display(){
        System.out.println("this is an interface");
    }
}

public class INTERFACE {
    public static void main(String[] args) {
        def obj = new def();
        obj.display();
    }
}

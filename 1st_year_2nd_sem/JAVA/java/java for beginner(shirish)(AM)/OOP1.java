// default use of constructor without use of parameter



public class OOP1{
    public static void main(String[] args){
        cat tom = new cat();
        tom.height = 24;
        tom.weight = 122;
        tom.talks();
    }
}

 class cat{
    int height;
    int weight;
    void talks(){
        System.out.println("meww meww");
    }
}
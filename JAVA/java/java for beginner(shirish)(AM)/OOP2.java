// parameterized use of constructor with the use of parameter


public class OOP2{
    public static void main(String[] args){
        cat tom = new cat("tom",24,123);
        tom.details();
    }
}

 class cat{
    String name;
    int height;
    int weight;
    cat(String nm ,int he,int we){
        name = nm;
        height = he;
        weight = we;
    }
    void details(){
        System.out.println(name+" is a cat\n"+"his height is "+height+"\nhis weight is "+weight);
    }
}
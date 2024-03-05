// parameterized use of constructor with the use of parameter
// and use of 'this' operator


public class OOP3{
    public static void main(String[] args){
        cat tom = new cat("tom",24,123);
        tom.details();
        
    }
}

 class cat{
    String name;
    int height;
    int weight;
    cat(String name ,int height,int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    void details(){
        System.out.println(this.name+" is a cat\n"+"his height is "+this.height+"\nhis weight is "+this.weight);
    }
}
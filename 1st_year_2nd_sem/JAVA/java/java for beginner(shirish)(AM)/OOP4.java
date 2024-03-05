public class OOP4{
    public static void main(String[] args){
        cat tom = new cat("tom",24,123);
        cat jerry = new cat("jerry",34,200);
        tom.details();
        jerry.details();
        System.out.println(cat.statVariable);

        
    }
}

 class cat{
    static int statVariable = 0;
    String name;
    int height;
    int weight;
    cat(String name ,int height,int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        statVariable++;
    }
    void details(){
        System.out.println(this.name+" is a cat\n"+"his height is "+this.height+"\nhis weight is "+this.weight);
    }
}
public class factorial {
    public static void main(String [] args){
        fact obj = new fact(25);
        obj.get();
    }
    
}

class fact{
    double n;
    double fact_num = 1;
    fact(double n){
        this.n = n;
    }
    void get(){
        for(double i = 1;i<=n;i++){
            fact_num *= i;
        }
        System.out.println(fact_num);
    }

}
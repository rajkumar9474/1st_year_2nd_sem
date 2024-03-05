public class fibbonacci {
    public static void main(String[] args){
        fibbo obj = new fibbo(15);
        obj.get();
    }
}

class fibbo{
    int a = 0;
    int b = 1;
    int c;
    int count;
    fibbo(int count){
        this.count = count;
    }
    void get(){
        System.out.println(a);
        for(int i = 0;i<count-1;i++){
            c = a+b;
            System.out.println(c); 
            b = a;
            a = c;
        }
    }

}
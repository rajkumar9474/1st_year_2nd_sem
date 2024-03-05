import java.util.Scanner;

public class count_words_using_new_class {
    public static void main(String[] args) {
        words_count obj1 = new words_count();
        obj1.get_string();
        obj1.count_words();
    }

}
class words_count{
    static int num_word = 1;
    static String str;
    void get_string(){
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        str = scn.nextLine();
    }
    void set_string(String string){
        str = string;
    }
    void count_words(){
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ','){
                num_word++;
            }
        }
        System.out.println("the number of words is "+num_word);
    }
}
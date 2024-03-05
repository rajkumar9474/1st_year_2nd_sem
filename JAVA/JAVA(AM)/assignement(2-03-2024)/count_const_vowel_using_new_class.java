import java.util.Scanner;

public class count_const_vowel_using_new_class {
    public static void main(String[] args) {
        letter_count obj1 = new letter_count();
        obj1.get_string();
        obj1.vowel_num();
        obj1.const_num();
    }
}
class letter_count{
    static int num_vowel = 0;
    static int num_const = 0;
    static String str;
    void get_string(){
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        str = scn.nextLine();
        str = str.toLowerCase();
    }
    void set_string(String string){
        str = string;
    }
    void const_num(){
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
            }
            else if(str.charAt(i) == ' '|| str.charAt(i) == '.'|| str.charAt(i) == ','){
                // skip this condition
            }
            else{
                num_const++;
            }
        }
        System.out.println("total number of constant is "+num_const);
    }
    void vowel_num(){
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                num_vowel++;
            }
            else if(str.charAt(i) == ' '|| str.charAt(i) == '.'|| str.charAt(i) == ','){
                // skip this condition
            }
            else{
            }
        }
        System.out.println("total number of vowel is "+num_vowel);
    } 
}
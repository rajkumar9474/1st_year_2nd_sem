
import java.util.Scanner;

public class count_const_vowel {
    public static void main(String[]args){
        int num_vowel = 0;
        int num_const = 0;
        String str;
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        str = scn.nextLine();
        str = str.toLowerCase();

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u'){
                num_vowel++;
            }
            else if(str.charAt(i) == ' '|| str.charAt(i) == '.'|| str.charAt(i) == ','){
                // skip this condition
            }
            else{
                num_const++;
            }

        }
    System.out.println("the number of constant is "+num_const+"\nthe number of vowel is "+num_vowel);
    }
}

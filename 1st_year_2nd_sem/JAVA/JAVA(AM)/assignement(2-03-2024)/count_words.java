
import java.util.Scanner;

public class count_words {
    public static void main(String[]args){
        int num_word = 1;
        String str;
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        str = scn.nextLine();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ','){
                num_word++;
            }
        }
    System.out.println("the number of words is "+num_word);
    }
}

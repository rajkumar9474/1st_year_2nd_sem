import java.util.Scanner;

public class palindrome{
    String str;
    
    static boolean check_palindrome(String str){
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }

        boolean is_palin = true;
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i) != rev.charAt(i)){
                is_palin = false;
                return is_palin;
            }
        }
        return is_palin;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str;
        System.out.println("enter the string to check: ");
        str = scn.next();
        System.out.println(str+" is "+(check_palindrome(str)?"palindrome":"not palindrome"));
    }
}

import java.util.Scanner;

public class reverse_string{
    String str;
    
    static String convert_rev(String str){
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str;
        System.out.println("enter the string to check: ");
        str = scn.nextLine();
        System.out.println("reversed of "+str+" is "+convert_rev(str));
    }
}
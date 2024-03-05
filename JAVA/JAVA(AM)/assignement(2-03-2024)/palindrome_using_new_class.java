import java.util.Scanner;

public class palindrome_using_new_class {
    public static void main(String[] args) {
        check_palindrome obj1 = new check_palindrome();
        obj1.get_string();
        obj1.check();
    }
    
}
class check_palindrome{
    static String str;
    static String rev = "";
    Scanner scn = new Scanner(System.in);
    void get_string(){
        System.out.println("enter the string to check: ");
        str = scn.nextLine();
        str = str.toLowerCase();
    }
    boolean check(){
        for(int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }

        boolean is_palin = true;
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i) != rev.charAt(i)){
                is_palin = false;
                System.out.println();
                return is_palin;
            }
        }
        return is_palin;
    }
}
import java.util.Scanner;

public class reverse_string_using_new_class {
    public static void main(String[] args) {
        string_rev obj1 = new string_rev();
        obj1.get_string();
        obj1.convert_rev();
        
    }
}
class string_rev{
    static String str;
    static String rev = "";
    void get_string(){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string to check: ");
        str = scn.nextLine();
    }
    void set_string(String string){
        str = string;
    }
    void convert_rev(){
        
        for(int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
import java.util.Scanner;


public class find_out_a_substring_using_new_class {
    public static void main(String[] args) {
        substring_ obj1 = new substring_();
        obj1.get_string();
        obj1.substr();
    }
}
class substring_{
    int s_num,e_num;
    static String empty_str = "";
    static String str;
    void get_string(){
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        str = scn.nextLine();
    }
    void set_string(String string){
        str = string;
    }
    void substr(){
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the starting index: ");
        s_num = scn.nextInt();
        System.out.println("enter the ending index: ");
        e_num = scn.nextInt();
        if(e_num<=str.length()){
            for(int i = s_num;s_num>-1 && i<e_num;i++){
                empty_str = empty_str+str.charAt(i);
            }
        }
        System.out.println(empty_str);
    }

}

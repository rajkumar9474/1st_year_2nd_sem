

import java.util.Scanner;

public class find_out_a_substring {
    public static void main(String[] args) {
        String str;
        int s_num,e_num;
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        str = scn.nextLine();
        System.out.println("enter the starting index: ");
        s_num = scn.nextInt();
        System.out.println("enter the ending index: ");
        e_num = scn.nextInt();
        System.out.println(substr(str, s_num, e_num));
    }
    static String substr(String str,int s_num,int e_num){
        String n_str = "";
        if(e_num<=str.length()){
            for(int i = s_num;s_num>-1 && i<e_num;i++){
                n_str = n_str+str.charAt(i);
            }
        }
        return n_str;
    }
    }
   

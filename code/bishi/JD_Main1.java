package bishi;

import java.util.Scanner;

public class JD_Main1 {
    public static String solution(String string){
        String res = "";
        int str_len = string.length();
        int i = 0;
        while (i<str_len){
            if (string.charAt(i)>='0' && string.charAt(i)<='9'){
                int sum_x = 0;
                String step = "";
                while (i <str_len && string.charAt(i)>='0' && string.charAt(i)<='9'){
                    sum_x++;
                    step+=string.charAt(i);
                    i++;
                }
                if (sum_x==4){
                    int temp = Integer.parseInt(step);
                    if (temp>=1000&&temp<=3999){
                        res+=step+" ";
//                        System.out.print(step+" ");
                    }
                }
            }
            else {
                i+=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string.length()>2000){
            System.out.println();
            return;
        }
         String res = solution(string);
        System.out.println(res);
    }
}

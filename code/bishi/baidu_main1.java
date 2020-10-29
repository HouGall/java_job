package bishi;

import java.util.Scanner;

public class baidu_main1 {
    public static String solution(String str){
        StringBuffer res1 = new StringBuffer();
        int i = 0;
        while (i<str.length()){
            char temp = str.charAt(i);
            if (res1.indexOf(String.valueOf(temp)) == -1){
                res1.append(str.charAt(i));
            }
            else {
                if (res1.charAt(res1.length()-1) == str.charAt(i)){
                    i+=1;
                    continue;
                }
                else {
                    res1.append(str.charAt(i));
                }
            }
            i+=1;
        }
        return res1.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}

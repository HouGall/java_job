package bishi;

import java.util.Scanner;

public class Main1 {
    public static int Zeor(int num){
        int count = 0;
        while (num>0){
            count+= num/5;
            num=num/5;
        }
        return count;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int res = Zeor(num);
//        System.out.println(res);
        String a = "a";
        String b = new String("a");
        System.out.println(a==b);
    }
}

package bishi;

import java.util.Scanner;

//联通第一题
public class LT_Main1 {
    static double help(double n,double x){
        int sum = 0;
        while (n>=x){
            sum++;
            n-=x;
        }
        if (sum>0){
            if (x%1==0){
                System.out.print((int)x+":"+sum+";");
            }
            else{
                System.out.print(x+":"+sum+";");
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextFloat();
        double n2 = sc.nextFloat();
        double cha = n2-n1;
        System.out.print(cha+" ");
        double[] mianzhi = {100,50,10,5,1,0.5,0.1};
        for (double v : mianzhi) {
            cha = help(cha,v);
        }
    }
}

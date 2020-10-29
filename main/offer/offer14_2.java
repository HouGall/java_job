package main.offer;

import java.util.Map;

public class offer14_2 {
    /*
    给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
    每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
    例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
    结果取模1000000007
     */
    public static double pow(long a,int b){
        //扩写了所有整数的幂运算
        boolean flag = false;
        if (b<0){
            flag = true;
            b = Math.abs(b);
        }
        double res=1;
        while (b!=0){
            if (b%2!=0){
                res = ((res%1000000007)*(a%1000000007))%1000000007;
            }
            b>>>=1;
            a = ((a%1000000007)*(a%1000000007))%1000000007;
        }
        if (flag){
            res = 1/res;
        }
        return res;
    }
//    public static int cuttingRope(int n) {
//        if(n<=3) return n-1;
//        int yushu = n%3;
//        int shang = n/3;
//        if (yushu==0){
//            return (int)pow(3,shang);
//        }
//        else if(yushu==1) {
//            long res = pow(3,shang-1)*4;
//            return (int)(res%1000000007);
//        }
//        else {
//            long res =  pow(3,shang)*2;
//            return (int)(res%1000000007);
//        }
//    }

    public static void main(String[] args) {
        int n = 255;
//        System.out.println(cuttingRope(n));
        System.out.println(pow(-2,-2));
    }

}

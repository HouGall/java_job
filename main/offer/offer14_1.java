package main.offer;

public class offer14_1 {
    /*
    给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
    每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
    例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

     */
    /*
    思路：可以转成数学计算方式，看作是计算算术平均不等式的的最大值计算，通过推导可以知道当所有的段一样长时，积最大
    但是所要求每段长度为整数，通过求导可知，当为3时，积最大，但是会存在余数
    对余数进行判断，当为0时，正好整除
    当为1时，最大为3**a*（2*2）
    当为2时，最大为3**a*2;
     */
    public static int cuttingRope(int n) {
        if(n<=3) return n-1;
        int yushu = n%3;
        int shang = n/3;
        if (yushu==0)return (int)Math.pow(3,shang);
        else if(yushu==1)return (int)Math.pow(3,shang-1)*4;
        else return (int)Math.pow(3,shang)*2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(cuttingRope(n));
    }
}

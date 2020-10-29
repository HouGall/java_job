package main.offer;
/*
Fibonacci数列
斐波那契数列计算
 */
public class offer09 {
    //方法一：递归实现
    public static int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return (fib(n-1)+fib(n-2))%1000000008;
    }
    //方法二：动态规划
    public static int fib2(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        int[] dp = new int[2];
        dp[1] = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (dp[0]+dp[1])%1000000008;
            dp[0] = dp[1];
            dp[1] = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 45;
        System.out.println(fib(num));
        System.out.println(fib2(num));
    }
}

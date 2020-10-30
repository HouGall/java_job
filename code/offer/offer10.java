package offer;

/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
1000000007
思路：
当有n阶台阶时，可以从n-1阶跳一阶上去，也可以从n-2阶跳2阶跳上去，所以对于到达第n阶台阶，他的总跳法是n-1阶与n-2两种跳法的和。
当有1阶台阶时，跳法是1种，当有2阶时，跳法有2种。
 */
public class offer10 {
    public static int numWays(int n) {
        if (n==1)return 1;
        if(n==0)return 1;
        return numWays(n-1)+numWays(n-2);
    }
    public static int numWays1(int n) {
        if (n==0)return 1;
        if (n==1)return 1;
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (dp[0]+dp[1])%1000000007;
            dp[0] = dp[1];
            dp[1] = res;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numWays(n));
        System.out.println(numWays1(n));
    }
}

package main.offer;

/*
地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
递归思路
 */
public class offer13 {
    public static int sum(int num){
        int res = 0;
        while (num>=10){
            res+=num%10;
            num = num/10;
        }
        res+=num;
        return res;
    }
    public static int help(int m,int n,int k,int x,int y,boolean[][] mark){
        if(x<0||x>=m||y<0||y>=n||(sum(x)+sum(y)>k)||mark[x][y])return 0 ;
        mark[x][y] = true;
        int res =  help(m, n, k, x-1, y, mark)+help(m, n, k, x, y-1, mark)+
                help(m, n, k, x+1, y, mark)+help(m, n, k, x, y+1, mark)+1;
        return res;

    }
    public static int movingCount(int m, int n, int k) {
        if (k==0)return 1;
        if(m==0||n==0)return 0;
        boolean[][] mark = new boolean[m][n];
        int res = help(m,n,k,0,0,mark);
        return res;


    }
    public static void main(String[] args) {
        System.out.println(movingCount(38,15,9));

    }
}

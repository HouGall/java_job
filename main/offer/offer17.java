package main.offer;

/*
输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

 */
public class offer17 {
    public static int[] printNumbers(int n) {
        if (n==0) return new int[0];
        int num = (int)Math.pow(10,n)-1;
        int[] res = new int[num];
        for (int i =1;i<=num;i++){
            res[i-1] = i;
        }
        return res;
    }
}

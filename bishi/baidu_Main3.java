package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class baidu_Main3 {
    public static boolean solution(int x,int y,int[][] nums){
        if (x<0 || x>=nums.length || y<0 || y>= nums.length ){
            return false;
        }
        if (nums[x][y] == 1 || nums[x][y]==-1){
            return true;
        }
        int temp = nums[x][y];
        nums[x][y]=-1;
        boolean res1 = solution(x-1,y,nums) && solution(x,y-1,nums) && solution(x+1,y,nums) && solution(x,y+1,nums);
        if (res1){
            nums[x][y] = 1;
            return res1;
        }
        else {
            nums[x][y] = temp;
            return res1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num[i][j]==0){
                    boolean T = solution(i,j,num);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}

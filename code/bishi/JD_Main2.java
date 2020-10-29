package bishi;

import java.util.Scanner;

public class JD_Main2 {
    public static boolean solution(char[][] nums,int x,int y){
        if (x<0 || x>=nums.length || y <0 ||y >= nums[0].length || nums[x][y]=='#'|| nums[x][y]=='p'){
            return false;
        }
        if (nums[x][y]=='E'){
            return true;
        }
        char step = nums[x][y];
        nums[x][y] = 'p';
        boolean res = solution(nums,x+1,y) || solution(nums,x-1,y) || solution(nums,x,y+1) || solution(nums,x,y-1);
        nums[x][y] = step;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] nums = new char[n][m];
            String KK = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                String TT = scanner.nextLine();
                for (int k = 0; k < m; k++) {
                    nums[j][k] = TT.charAt(k);
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (nums[j][k]=='S'){
                        boolean res = solution(nums,j,k);
                        if (res){
                            System.out.println("YES");
                        }
                        else {
                            System.out.println("NO");
                        }
                        break;
                    }
                }
            }

        }
    }
}

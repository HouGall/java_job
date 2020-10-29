package bishi;

import java.util.Scanner;

public class mi_ha_you_Main2 {
    public static boolean solution(String s,String p){
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        if (s.length()==0 || p.length()==0){
            return false;
        }
        dp[0][0] = true;
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i-1) == '*' && dp[0][i-2]){
                dp[0][i] = true;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j < p.length(); j++) {
                if (s.charAt(i-1)==p.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    if (p.charAt(j-1)=='.'){
                     dp[i][j] = dp[i-1][j-1];
                    }
                    else if (p.charAt(j-1) == '*'){
                        if (j>2){
                            if (s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2)== '.')
                                dp[i][j] = dp[i][j-1] || dp[i-1][j];
                            dp[i][j] = dp[i][j] || dp[i][j-2];
                        }
                    }
                    else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        boolean res = solution(s,p);
        System.out.println(res);
    }
}

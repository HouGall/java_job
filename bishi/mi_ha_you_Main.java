package bishi;

import java.util.Scanner;

public class mi_ha_you_Main {
    public static char[][] solution(int N,int M){
        char[][] res = new char[N][M];
        int top = 0;
        int botton = N-1;
        int left = 0;
        int right = M-1;
        int start = 65;
        while (left<=right && top<=botton){
            if (left<=right){
                for (int i = left; i <= right; i++) {
                    if (start == 91) {
                        start = 65;
                    }
                    res[top][i] = (char)start;
                    start += 1;
                }
            }
            top+=1;
            if(top<=botton){
                for (int i = top; i <= botton; i++) {
                    if(start==91){
                        start=65;
                    }
                    res[i][right] = (char)start;
                    start+=1;
                }
            }
            right-=1;
            if(left<=right){
                for (int i = right; i >= left; i--) {
                    if(start==91){
                        start=65;
                    }
                    res[botton][i] = (char)start;
                    start+=1;
                }
            }
            botton-=1;
            if(top<=botton){
                for (int i = botton; i >= top; i--) {
                    if(start==91){
                        start=65;
                    }
                    res[i][left] = (char)start;
                    start+=1;
                }
            }
            left+=1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N<1 && M <1){
            System.out.println("");
            return;
        }
        char[][] res = solution(N,M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(res[i][j]+" ");
//                System.out.print(' ');
                if (j==M-1){
                    System.out.println();
                }
            }

        }
    }
}

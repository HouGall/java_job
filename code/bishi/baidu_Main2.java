package bishi;

import java.util.Scanner;

public class baidu_Main2 {
    public static int solution(int[] xyz,int[] abc,int sum_M){
        int sum_time = 0;
        for (int i = 0; i < 3; i++) {
            sum_time += xyz[i]*abc[i];
        }
        return sum_M/sum_time;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xyz = new int[3];
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            xyz[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int sum_M = 0;
        for (int i = 0; i < M; i++) {
            sum_M += sc.nextInt();
        }
        System.out.println(solution(xyz,abc,sum_M));;
    }
}

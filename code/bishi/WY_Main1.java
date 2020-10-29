package bishi;

import java.util.Scanner;

public class WY_Main1 {
    public static void createMatrix(int[][] matrix,int n){
        int i = 0,j=0,row=n,col= n,rowleft = 0,colleft = 0;
        int index = 1;
        while (true){
            while (j<col){
                matrix[i][j] = index++;
                j++;
            }
            j--;i++;rowleft++;
            if (i==row){
                break;
            }
            while (i<row){
                matrix[i][j] = index++;
                i++;
            }
            i--;j--;col--;
            if(j<colleft){
                break;
            }
            while (j>=colleft){
                matrix[i][j] = index++;
                j--;
            }
            j++;i--;row--;
            if(i<rowleft){
                break;
            }
            while (i>=rowleft){
                matrix[i][j] = index++;
                i--;
            }
            i++;j++;colleft++;
            if(j==col){
                break;
            }
            while (i<row){
                matrix[i][j] = index++;
                i++;
            }
            i--;j++;colleft++;
            if(j==col){
                break;
            }
            while (j<col){
                matrix[i][j] = index++;
                j++;
            }
            j--;i--;row--;
            if(i<rowleft){
                break;
            }
            while (i>=rowleft){
                matrix[i][j] = index++;
                i--;
            }
            i++;j--;col--;
            if(j<colleft){
                break;
            }
            while (j>=colleft){
                matrix[i][j] = index++;
                j--;
            }
            j++;i++;rowleft++;
            if(i==row){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C= sc.nextInt();
        while (C-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] matrix = new int[N][N];
            createMatrix(matrix,N);
            while (M-- >0){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                System.out.println(matrix[X][Y]);
            }
        }
    }
}

package offer;

/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

 */
public class offer29 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0) return new int[0];
        int left = 0;
        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int[] res = new int[(matrix.length)*(matrix[0].length)];
        int k = 0;
        while (true){
            if (left>right)break;
            for (int i=left;i<=right;i++){
                res[k] = matrix[top][i];
                k++;
            }
            top++;

            if (top>bottom)break;
            for (int i=top;i<=bottom;i++){
                res[k] = matrix[i][right];
                k++;
            }
            right--;

            if (left>right)break;
            for (int i = right;i>=left;i--){
                res[k] = matrix[bottom][i];
                k++;
            }
            bottom--;

            if (top>bottom)break;
            for (int i=bottom;i>=top;i--){
                res[k] = matrix[i][left];
                k++;
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] res = spiralOrder(matrix);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
//java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
//  at line 20, Solution.spiralOrder
//  at line 57, __DriverSolution__.__helper__
//  at line 82, __Driver__.main
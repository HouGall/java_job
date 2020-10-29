package main.offer;

/*
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 */
public class offer04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        int rowstart = 0;
        int colstart = matrix[0].length-1;
        while (rowstart< matrix.length&&colstart>=0){
            if(matrix[rowstart][colstart]==target){
                return true;
            }
            else if(matrix[rowstart][colstart]<target){
                rowstart++;
            }
            else colstart--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findNumberIn2DArray(matrix,11));
    }
}

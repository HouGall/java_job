package leetcode;

/**
 * Create by HouGall on 2020/10/30
给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地,0表示水域。

网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。

岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

 */
public class leetcode463 {
    public static int help(int[][] grid,int x,int y,boolean[][] mark){
        if (x<0|| x>grid.length-1||y<0||y>grid[0].length-1||grid[x][y]==0)return 1;
        if (mark[x][y])return 0;
        mark[x][y] = true;
        int top  = help(grid,x-1,y,mark);
        int left = help(grid,x,y-1,mark);
        int bottom = help(grid,x+1,y,mark);
        int right = help(grid,x,y+1,mark);
        return top+left+bottom+right;
//        return help(grid,x-1,y,mark)+help(grid,x,y-1,mark)+help(grid,x+1,y,mark)+help(grid,x,y+1,mark)+1;
    }
    public static int islandPerimeter(int[][] grid) {
        if (grid.length==0){
            return 0;
        }
        boolean[][] mark = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j= 0;j<grid[0].length;j++){
                if (grid[i][j]==1){
                    return help(grid,i,j,mark);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] nums = {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        int res = islandPerimeter(nums);
        System.out.println(res);
    }

}

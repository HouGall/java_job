package main.offer;

/*
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。

[["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]]

但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。

 */
public class offer12 {
    //采用dfs递归回溯进行判断
    public static boolean help(char[][] board,String word,int index,int x,int y){
        int rowlen = board.length;
        int collen = board[0].length;
        int wordlen = word.length();
        if (x<0||x>=rowlen||y<0||y>=collen||board[x][y]=='#'||board[x][y]!=word.charAt(index))return false;
        if (index==wordlen-1)return true;
        char temp = board[x][y];
        board[x][y] = '#';
        boolean res = help(board, word, index+1, x-1, y)||help(board, word, index+1, x, y+1)
                    ||help(board, word, index+1, x+1, y)||help(board, word, index+1, x, y-1);
        board[x][y] = temp;
        return res;
    }
    public static boolean exist(char[][] board, String word) {
        if(board.length==0)return false;
        if (word.length()==0) return true;
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board[0].length; i1++) {
                if (board[i][i1]==word.charAt(0)){
                    if(help(board, word,0,i,i1))return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] board = {{'a'}};
        String word = "ab";
        System.out.println(exist(board,word));
    }
}

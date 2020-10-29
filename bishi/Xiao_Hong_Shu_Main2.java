package bishi;

import java.util.Scanner;
/*
1、字符串有很多种切割的方法，使得切割出来的子串头尾是相同字符，本题要求找出其中一种切割的方法，使得它切割之后的子串数量是最少的。并把这个切割方法的子串数量作为输出

2、比如一个字符串为"abaccd",那么切割成"aba"、"cc"、"d"3个子串是满足条件的，输出结果就是 3
采用双指针形式，找到最大匹配的
 */
public class Xiao_Hong_Shu_Main2 {
    static int solution(String s) {
    int left = 0;
    int right = s.length()-1;
    int res1 =0;
    while (left<=right && left<s.length()){
        if (s.charAt(left)!=s.charAt(right)){
            right-=1;
        }
        else {
            res1+=1;
            left = right+1;
            right = s.length()-1;
        }
    }
    left = 0;
    right = s.length()-1;
    int res2 = 0;
    while (left<=right ){
        if (s.charAt(left)!=s.charAt(right)){
            left+=1;
        }
        else {
            res2+=1;
            right = left-1;
            left = 0;
        }
    }
    return Math.min(res1,res2);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = solution(_s);
        System.out.println(String.valueOf(res));

    }
}

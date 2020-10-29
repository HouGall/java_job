package bishi;

class Interval {
    int start;
    int end;
}

public class SG_Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回Interval类，start代表汪仔最少做对了多少道题，end代表汪仔最多做对了多少道题。
     * @param n int整型 选择题总数
     * @param k int整型 朋友做对的题数
     * @param str1 string字符串 长度为n只包含ABCD的字符串，其中第i个代表汪仔第i题做出的选择
     * @param str2 string字符串 长度为n只包含ABCD的字符串，其中第i个代表朋友第i题做出的选择
     * @return Interval类
     */
    public static Interval solve (int n, int k, String str1, String str2) {
        // write code here
        Interval res = new Interval();
        int count = 0;
        for (int i =0;i<n;i++){
            if (str1.charAt(i)==str2.charAt(i)){
                count++;
            }
        }
        if (n==k){
            res.start = count;
            res.end = count;
        }
        else {
            if (n-count>=k){
                res.start = 0;
            }
            else {
                res.start = k-count;
            }
            if(count>=k){
                res.end = n;
            }
            else {
                res.end = count+n-k;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Interval res = solve(3,1,"ABC","BBB");
        System.out.println(res.start);
        System.out.println(res.end);
    }
}

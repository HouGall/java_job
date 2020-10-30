package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by HouGall on 2020/10/26
 */
public class leetcode03 {
    public static int lengthOfLongestSubstring(String s) {
        int now = 0;
        int maxlen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
            else{
                now = Math.max(now,map.get(s.charAt(i))+1);
                map.put(s.charAt(i),i);
            }
            maxlen = Math.max(maxlen,i-now+1);

        }
        return maxlen;
//        int now = 0;
//        int maxlen = 0;
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i=0;i<s.length();i++){
//            if (!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),i);
//            }
//            else{
//                if (map.get(s.charAt(i))>now){
//                    now = map.get(s.charAt(i))+1;
//
//                }
//                map.put(s.charAt(i),i);
//            }
//            maxlen = Math.max(maxlen,i-now+1);
//
//        }
//        return maxlen;
    }
    public static void main(String[] args) {
        String s = "tmmzuxt";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}

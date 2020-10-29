package bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
int res1 = getMin(s1);
        int res2 = getMin(s2);
        if (res1==res2){
            System.out.println(res1+1);
        }
        else{
            System.out.println(Math.max(res1,res2));
        }
 */



public class a_li_Main2 {
    static Map<Character,Integer> map_s1;
    static Map<Character,Integer> map_s2;
    public static void tongji(Map<Character,Integer> map,String  s){
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
    }
    public static int solution(String s1,String s2){
        map_s1 = new HashMap<>();
        map_s2 = new HashMap<>();
        tongji(map_s1, s1);
        tongji(map_s2,s2);
        int max_1 = Math.max(map_s1.getOrDefault('1',0),map_s2.getOrDefault('1',0));
        int max_0 = Math.max(map_s1.getOrDefault('0',0),map_s2.getOrDefault('0',0));
        if (max_0>max_1){
            return max_1+1;
        }
        else {
            return max_0+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int res = solution(s1,s2);
        System.out.println(res);
    }
}

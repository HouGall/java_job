package bishi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Xiao_Hong_Shu_Main3 {
    static int solution(Integer[][] nums){
        Integer res = 0;
        for (Integer[] num:nums) {
            Arrays.sort(num, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
        }
        Arrays.sort(nums, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1]*o1[2]-o2[1]*o2[2];
            }
        });
        Integer[] temp = nums[nums.length-1];
        int i = nums.length-1;
        res = temp[0];
        while (i>=0){
            if (nums[i][2]>temp[1]){
                i-=1;
                continue;
            }
            if ((nums[i][1]>temp[1] && nums[i][2] >temp[2] )||(nums[i][1]>temp[2] && nums[i][2] >temp[1] )){
                temp = nums[i];
                res+=nums[i][0];
                i-=1;
            }
            else {
                Integer step = nums[i][0];
                nums[i][0] = nums[i][2];
                nums[i][2] = step;
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            Integer[][] nums = new Integer[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    nums[i][j] = sc.nextInt();
                }
            }
            System.out.println(solution(nums));
        }
    }
}

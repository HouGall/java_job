package offer;
/*
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */

import java.util.HashSet;
import java.util.Set;

public class offer03 {
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for (int num : nums) {
            if (!set.contains(num)){
                set.add(num);
            }
            else {
                res = num;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findRepeatNumber(nums));

    }
}

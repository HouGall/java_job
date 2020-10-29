package main.offer;

/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class offer21 {
    public static int[] exchange(int[] nums) {
        if(nums.length==0)return new int[0];
        if (nums.length==1)return nums;
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            while (left<right && nums[left]%2==1){
                left++;
            }
            while (left<right && nums[right]%2==0){
                right--;
            }
            if (left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = exchange(nums);
        System.out.println(res);
    }
}

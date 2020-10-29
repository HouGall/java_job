package bishi;

public class fast_sort {
    public static void solution(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min_x = nums[i];
            int index = i;
            for (int j = i+1; j < n; j++) {
                if (min_x>nums[j]){
                    min_x = nums[j];
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < n; i++) {

            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,4,6,1,4,3,6,8};
        solution(nums);
    }
}

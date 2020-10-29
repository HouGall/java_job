package main.offer;

import java.util.PriorityQueue;

//计算数组中的中位数
//使用O(n)的时间复杂度
public class media {
    public static void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    //方法一：快排思路，分而治之
    public static int fast_sort(int[] nums,int start,int end){
        int left = start;
        int right = end;
        int key = nums[end];
        while (left<right) {
            while (left<right && nums[left]<=key){
                left++;
            }
            while (left<right && nums[right]>=key){
                right--;
            }
            if(left<right){
                swap(nums,left,right);
            }
        }
        swap(nums,end,right);
        return left;
    }
    public static double solution(int[] nums){
        int len = nums.length;
        if (len==0)return -1;
        if (len == 1) {
            return nums[0];
        }
        int mid = (len-1)/2;

        int left = fast_sort(nums,0,len-1);
        while (mid!=left){
            if (left>mid){
                left = fast_sort(nums,0,left-1);
            }
            else {
                left = fast_sort(nums,left+1,len-1);
            }
        }
        if (len%2==0){
            return (double)(nums[mid]+nums[mid+1])/2;
        }
        else {
            return nums[mid];
        }
    }
    //思路二：最小堆思路，求解第k大的值
    public static double solution2(int[] nums){
        if(nums.length==0)return -1;
        if(nums.length==1)return nums[0];
        int len = nums.length;
        int queuelen  = len/2+1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < queuelen; i++) {
            queue.add(nums[i]);
        }
        for (int i = queuelen; i < len; i++) {
            if(nums[i]>=queue.peek()){
                queue.poll();
                queue.add(nums[i]);
            }
        }
        if(len%2==0)return (double)(queue.poll()+queue.peek())/2;
        else return (double)queue.peek();

    }
    public static void main(String[] args) {
        int[] nums = {10,3,5,2,1,4,6,8,9,7};
        System.out.println(solution(nums));
        System.out.println(solution2(nums));
    }

}


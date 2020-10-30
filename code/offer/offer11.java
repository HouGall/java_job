package offer;

/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。

 */
public class offer11 {
    //方法一：暴力搜寻
    public static int minArray(int[] numbers) {
        int len = numbers.length;
        if(len==1)return numbers[0];
        int i = 0;
        int j = 1;
        int res = numbers[0];
        while(j<numbers.length){
            if(numbers[j]<numbers[i]){
                res = numbers[j];
            }
            j++;
            i++;
        }
        return res;
    }
    //方法二：采用二分查找的思路
    //mid = (l+r)/2
    //当mid>r的值时，最小值在mid的右侧
    //当mid<r的值时，最小值在mid的左侧
    //当mid=r的值时，最小值在mid的右侧
    public static int minArray1(int[] numbers) {
        if(numbers.length==1)return numbers[0];
        int left = 0;
        int right = numbers.length-1;
        int mid;
        while (left<right){
            mid = (left+right)/2;
            if (numbers[mid]>numbers[right]){
                left = mid+1;
            }
            else if(numbers[mid]<numbers[right]){
                right = mid;
            }
            else {
                right--;
            }
        }
        return numbers[left];
    }
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(minArray1(nums));
    }
}

package bishi;

import java.util.*;
public class BK_main{
    public static int[] help(int[] nums){
        int[] res = new int[3];
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[0]-1;
        int c = nums[1];
        if (nums[2] == Math.max(b,c)){
            res[0] = a;
            res[1] = b;
            res[2] = c;
        }
        b =  nums[0];
        a = nums[0]-1;
        c = nums[2];
        if (nums[1] == Math.max(a,c)){
            res[1] = a;
            res[0] = b;
            res[2] = c;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++){
            int[] nums = new int[3];
            for (int j = 0;j<3;j++){
                nums[j] = sc.nextInt();
            }
            int[] res = help(nums);
            if (res[0]<=0 || res[1]<=0 || res[2]<=0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(res[0]+" "+res[1]+" "+res[2]);
            }
        }

    }
}

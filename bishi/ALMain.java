package bishi;

import java.util.*;

/*
阿里面试题1
有+有-
 */
public class ALMain {
    public static void solution(String string){
        Stack<Integer> nums = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch ==' '){
                continue;
            }
            if(ch-'0'>=0 && ch-'0'<=9){
                int temp = ch - '0';
                if (!op.isEmpty()&&op.peek()=='-'){
                    temp = -(ch-'0');
                }
                nums.push(temp);
            }
            else if(ch==')'){
                char x= op.pop();
                int res = nums.pop();
                while (x != '('){
                    int num1 = nums.pop();
                    res+=num1;
                    x = op.pop();
                }
                nums.push(res);
            }
            else {
                op.push(ch);
            }
        }
        while (!op.isEmpty()){
            int num1= nums.pop();
            int num2 = nums.pop();
            nums.push(num1+num2);
            char x= op.pop();

        }
        int res = nums.pop();
        System.out.println(res);
//        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String string = sc.nextLine();
        solution(string);
    }
}

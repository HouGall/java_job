package offer;

import java.util.Stack;

/*
用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )

 */
public class offer08 {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;
    public offer08() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        else {
            if(!stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
            else{
                return -1;
            }
        }
    }
}

package offer;

import java.util.Stack;

/*
定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class offer30 {
    static Stack<Integer> stack ;
    static Stack<Integer> help;
    /** initialize your data structure here. */
    public offer30() {
        stack = new Stack<>();
        help = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (help.isEmpty() || help.peek()>=x){
            help.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x==help.peek()){
            help.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return help.peek();
    }
}

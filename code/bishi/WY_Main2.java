package bishi;

import javafx.scene.transform.Scale;

import java.util.*;

public class WY_Main2 {
    static Map<Integer,String> dic;
    static Deque<Integer> deque;
    static int count;
    public static void open(String name,int N){
        if (!deque.isEmpty()){
            int x= deque.pollFirst();
            dic.put(x,name);
            System.out.println(x);
        }
        else{
            dic.put(count,name);
            System.out.println(count);
            count++;
        }
    }
    public static void dup(int x,int N){
        String temp = dic.get(x);
        if (!deque.isEmpty()){
            int y = deque.pollFirst();
            dic.put(y,temp);
            System.out.println(y);
        }
        else{
            dic.put(count,temp);
            System.out.println(count);
            count++;
        }
    }
    public static void dup2(int x,int y){
        String temp = dic.get(x);
        dic.put(y,temp);
    }
    public static void close(int x){
        dic.remove(x);

        Stack<Integer> temp = new Stack<>();
        while (!deque.isEmpty()&&deque.peekLast()>x){
            temp.add(deque.pollLast());
        }
        deque.addLast(x);
        while (!temp.isEmpty()){
            deque.addLast(temp.pop());
        }
    }
    public static void query(int x){
        String temp = dic.get(x);
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            dic = new HashMap<>();
            deque = new LinkedList<>();
            count = 0;
            int N = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < N; j++) {
                String[] op = sc.nextLine().split(" ");
                if ("open".equals(op[0])){
                    open(op[1],N);
                }
                else if("dup".equals(op[0])){
                    int x = Integer.parseInt(op[1]);
                    dup(x,N);
                }
                else if("dup2".equals(op[0])){
                    int x = Integer.parseInt(op[1]);
                    int y = Integer.parseInt(op[2]);
                    dup2(x,y);
                }
                else if ("close".equals(op[0])){
                    int x = Integer.parseInt(op[1]);
                    close(x);
                }
                else {
                    int x= Integer.parseInt(op[1]);
                    query(x);
                }
            }
        }
    }
}
//2
//10
//open libc.so
//open libm.so
//open libdl.so
//dup 2
//dup2 0 2
//close 0
//query 1
//query 2
//query 3
//open log.txt
//10
//open output.txt
//dup2 0 1000000
//close 0
//open output2.txt
//dup2 0 100000
//close 0
//open 1.txt
//dup 100000
//query 1
//query 0
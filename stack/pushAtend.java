package stack;

import java.util.Stack;

public class pushAtend {
    public static void PushEnd(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushEnd(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       PushEnd(5, s);
       while(!s.isEmpty()){
           System.out.println("Top element is "+s.peek());
          s.pop();
    }
}
}

package stack;

import java.util.ArrayList;
// import java.util.List;
// import java.util.Stack;

public class stackarr {
    static class stac{
    static ArrayList<Integer> lis = new ArrayList<>();
    public static boolean isempty(){
        return lis.size()==0;
    }
    public static void push(int data){
        lis.add(data);
    }
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top=lis.get(lis.size()-1);
        lis.remove(lis.size()-1);
        return top;
    }
    public static int peek(){
        return lis.get(lis.size()-1);
    }
}
    public static void main(String[] args) {
        stac s= new stac();
       s.push(1);
       s.push(2);
       s.push(41);
       s.push(15);
       s.push(16);
       while(!s.isempty()){
           System.out.println("Top element is "+s.peek());
          s.pop();
    }
}
}

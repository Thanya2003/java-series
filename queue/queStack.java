package queue;

import java.util.*;
// import javax.xml.transform.Source;

public class queStack {
    static class Queue{
    static Stack <Integer> S1= new Stack<>();
    static Stack <Integer> S2= new Stack<>();
    public static boolean isEmpty(){
        return S1.isEmpty() && S2.isEmpty();
    }
    public static void push(int x){
    while(!S1.isEmpty()){
        S2.push(S1.pop());
    }
    S1.push(x);
    while(!S2.isEmpty()){
        S1.push(S2.pop());
    }
    }
    public static void pop(){
        if(isEmpty()){
            System.out.println("empty");
        }
        S1.pop();
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        return S1.peek();
    }
}
    public static void main(String[] args) {
    Queue qu = new Queue();
    qu.push(10);   
    qu.push(20);
    qu.push(30);
    qu.push(40);
    qu.push(50);

    while(!qu.isEmpty()){
    System.out.println(qu.peek());
    qu.pop();

    }
}  
}

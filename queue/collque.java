package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class collque {
    public static void main(String[] args) {
        // Queue <Integer> qu = new LinkedList<>();
        Queue <Integer> qu = new ArrayDeque<>();
        qu.add(10);   
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);
    
        while(!qu.isEmpty()){
        System.out.println(qu.peek());
        qu.remove();
    
        }
    }
}

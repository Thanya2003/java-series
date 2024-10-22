package queue;

public class linQue {
    static class Node{
        int data;
        Node next;
        Node( int data){
            this.data= data;
            this.next=null;
        }
    }
        static class queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
    
        public void Enque(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            tail=head=newnode; 
        }else{
        tail.next=newnode;
        tail=newnode;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        int res=head.data;
        if(head== tail){
            tail=null;
        }
        head=head.next;
        return res;
    
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        return head.data;
    }
}
    
public static void main(String[] args) {
    queue qu = new queue();
    qu.Enque(10);   
    qu.Enque(20);
    qu.Enque(30);
    qu.Enque(40);
    qu.Enque(50);

    while(!qu.isEmpty()){
    System.out.println(qu.peek());
    qu.dequeue();

    }
}
    }
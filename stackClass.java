public class stackClass {
   static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next =null;
    }
   }
   
   static class Stack{
    public static Node head;
    public static boolean isempty(){
        return head==null;
    }
   
   public static void push(int data){
    Node newNode = new Node(data);
    if(isempty()){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
   }

   public static int pop(){
    if(isempty()){
        return  -1;
    }
    int top=head.data;
    head=head.next;
    return top;
   }
   public static int peek(){
    if(isempty()){
        return -1;
    }
    return head.data;
   }
}
   public static void main(String[] args) {
       Stack s= new Stack();
       s.push(1);
       s.push(2);
       s.push(41);
       s.push(15);
       s.push(16);
       while(!Stack.isempty()){
           System.out.println("Top element is "+s.peek());
          s.pop();
       }
       
   }
}

package queue;

public class queArray {
   static class queue{
    static int[] arr;
    static int size;
    static int rear=-1;
    queue(int size){
        arr=new int[size];
        this.size=size;
    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    public boolean isFull(){
        return rear==size-1;
    }
    public void Enque(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        int front=arr[0];
        for(int i=0;  i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        return arr[0];
    }
    

}
public static void main(String[] args) {
    queue qu = new queue(5);
    qu.Enque(10);   
    qu.Enque(20);
    qu.Enque(50);
    qu.Enque(30);
    qu.Enque(40);
    while(!qu.isEmpty()){
    System.out.println(qu.peek());
    qu.dequeue();

    }
}
}

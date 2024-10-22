package queue;

public class CirQueu {
    static class queue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front=-1;
        queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return rear==(rear+1)%size;
        }
        public void Enque(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        int res=arr[front];
        if(front==rear){
            return front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return res;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is full");
            return -1;
        }
        return arr[front];
    }
}
public static void main(String[] args) {
    queue qu = new queue(5);
    qu.Enque(10);   
    qu.Enque(20);
    qu.Enque(30);
    qu.Enque(40);
    qu.Enque(50);
    System.out.println("removed "+qu.dequeue());
    qu.Enque(60);
    System.out.println("removed "+qu.dequeue());
    qu.Enque(70);
    

    System.out.println();
    System.out.println();
    while(!qu.isEmpty()){
    System.out.println(qu.peek());
    qu.dequeue();

    }
}

}

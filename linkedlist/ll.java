package linkedlist;

public class ll {
    Node head;
    private int size;
    ll(){
        size=0;
    }
    class Node{
        String data;
        Node next;

    Node(String data) {
            this.data=data;
            this.next=null;
            size++;
        }
    }
        public void AddFirst(String data){
            Node newnode= new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
           
        }
        public void AddEnd(String data){
            Node newnode= new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newnode;
        }
        public void printll(){
            // Node newnode= new Node(data);
            if(head==null){
               System.out.println("The List is empty");
                return;
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");
        }   
        public void DeleteFirst(){
            if(head==null){
                System.out.println("The List is empty");
            }
            size--;
            head=head.next;
        }
        public void DeleteEnd(){
            if(head==null){
                System.out.println("The List is empty");
                return;
            }  
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secNode=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secNode=secNode.next;
            }
            secNode.next=null;
        }
        public int getSize(){
            return size;
        }
    public static void main(String[] args) {
        ll list = new ll();
        list.AddFirst("Mother");
        list.AddFirst("Father");
        list.printll();
        list.AddEnd("FIRST Child");
        list.AddEnd("Second Child");
        list.printll();
        list.DeleteFirst();
        list.printll();
        list.DeleteEnd();
        list.printll();
        System.out.println(list.getSize());
        System.out.println(list.getSize());

    }
}

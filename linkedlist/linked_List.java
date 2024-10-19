package linkedlist;


public class linked_List {
    Node head;
    public  void insert(int data){
        Node node = new Node();
         node.data= data;
         node.next = null;
        if(head==null){
            head= node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node node= head;
        while(node.next!=null){
            node=node.next;
            
            System.out.println(node.data);
        }
    }
}

package linkedlist;

import java.util.LinkedList;

public class llcoll {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("is ");
        list.add("a ");
        list.addFirst("Apple");
        list.add("Fruit");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("null");
    }
}

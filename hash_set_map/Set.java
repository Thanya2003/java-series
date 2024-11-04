package hash_set_map;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Inasertion
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(2);

        // search
        if(set.contains(4)){
            System.out.println("Found element");
        }

        // Delete
        // set.remove(3);
        if(!set.contains(3)){
            System.out.println("Element not found");
        }
        // iterator
        Iterator is =set.iterator();

        while(is.hasNext()){
            System.out.println(is.next());
        }

    
    }
}

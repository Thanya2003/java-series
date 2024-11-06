package hash_set_map;

import java.util.*;

public class UE {
    public static void Union(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Size of the array "+set.size());
       Iterator is= set.iterator();
       while(is.hasNext()){
        System.out.print(is.next()+" ");
       }
    }
    public static void main(String[] args) {
        int[] arr1={7, 3, 9, 10, 8};
        int[] arr2={1, 2, 3, 8, 9, 5};
        Union(arr1, arr2);
    }
    
}

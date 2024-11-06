package hash_set_map;

import java.util.HashSet;
import java.util.Iterator;

public class IE {
    public static void intersectionElement(int[] arr1, int[] arr2){
        HashSet <Integer> setA= new HashSet<>();
        HashSet <Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            setA.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(setA.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        System.out.println(set.size());
        Iterator is = set.iterator();
        while(is.hasNext()){
            System.out.print(is.next()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1={7, 3, 9, 10, 8};
        int[] arr2={1, 2, 3, 8, 9, 5};
        intersectionElement(arr1, arr2);
    }
}

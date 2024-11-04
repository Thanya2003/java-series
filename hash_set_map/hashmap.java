package hash_set_map;

import java.util.*;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap <String, Integer> map=new HashMap<>();

        map.put("India", 120);
        map.put("China", 150);
        map.put("Italy", 10);
        map.put("US", 80);
        System.out.println(map);

        map.put("India", 160);
        System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
        System.out.println(map.get("India"));
        System.out.println(map.get("Indoneasia"));
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+":"+e.getValue()+"   ");
        }
        System.out.println();

        Set<String> keys =map.keySet();
        for(String key : keys){
            System.out.print(key+" "+map.get(key)+" ");
        }
        System.out.println();
        map.remove("China");
        System.out.println(map);
    }
}

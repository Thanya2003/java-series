package hash_set_map;

import java.util.HashMap;
import java.util.Map;

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
    }
}

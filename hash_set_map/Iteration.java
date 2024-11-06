package hash_set_map;

import java.util.HashMap;

public class Iteration {
    public static String getStart(HashMap<String, String> Ticks){
        HashMap<String, String> revMap= new HashMap<>();
        String Start;
        for(String key : Ticks.keySet()){
            revMap.put(Ticks.get(key), key);

        }     
    for(String key : Ticks.keySet()){
        if(revMap.containsKey(key)==false){
            return key;
    } 
}
    return null;
}
    public static void main(String[] args) {
        HashMap<String, String> Tickets=new HashMap<>();
        Tickets.put("Chennai", "Bengaluru");
        Tickets.put("Mumbai", "Delhi");
        Tickets.put("Goa", "Chennai");
        Tickets.put("Delhi", "Goa");

        String Start =getStart(Tickets);
        while(Tickets.containsKey(Start)){
            System.out.print(Start+"---->");
            Start=Tickets.get(Start);
        }
        System.out.print(Start);

    }
}

package hash_set_map;

import java.util.*;

public class ME {
    public static void MajorityElement(int[] nums){
        HashMap <Integer, Integer> map= new HashMap<>();
        int N=nums.length;
    for(int i=0; i<N; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
        }else{
            map.put(nums[i], 1);
        }
 }
    for(int key: map.keySet()){
        if(map.get(key)<N/3){
            System.out.println(key+":"+map.get(key));
        }
    }
    }
    public static void main(String[] args) {
        int[] nums ={1, 2, 1, 3, 5, 1, 5, 1, 3};
        MajorityElement(nums);
    }
}

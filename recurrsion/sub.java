package recurrsion;

import java.util.HashSet;

public class sub {
    public static void subSequence(int idx, String str, String newString , HashSet<String> set){
        if(idx== str.length()){
            if(set.contains(newString)){
                return;
            }else{
        System.out.println(newString);
        set.add(newString);
        return;
    }
}
    char currstr = str.charAt(idx);
    subSequence(idx+1, str, newString+currstr, set);
    subSequence(idx+1, str, newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subSequence(0, "abb", "", set);
    }
    
}

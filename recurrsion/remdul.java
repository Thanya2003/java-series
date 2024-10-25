package recurrsion;

public class remdul {
    public static boolean[] map=new boolean[26];
    public static void removeduplicate(int idx, String str, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currstr= str.charAt(idx);
        if(map[currstr-'a']){
            removeduplicate(idx+1, str, newString);
        }else{
            newString += currstr;
            map[currstr-'a']=true;
            removeduplicate(idx+1, str, newString);
        }
    }
    public static void main(String[] args) {
        removeduplicate(0, "aabbccdarrfssfr", "");
    }
}

package recurrsion;

public class keypad {
    public static String[] keypad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void combination(String str, int idx, String com){
       if(idx==str.length()){
        System.out.println(com);
        return;
       }
        char curr = str.charAt(idx);
        String mapping= keypad[curr-'0'];
        for(int i=0; i<mapping.length(); i++){
            combination(str, idx+1, com+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        combination("23", 0, "");
    }
}

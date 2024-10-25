package recurrsion;

public class sub {
    public static void subSequence(int idx, String str, String newString ){
        // int count =0;
        if(idx== str.length()){
        System.out.println(newString);
        return;
    }
    char currstr = str.charAt(idx);
    subSequence(idx+1, str, newString+currstr);
    // count++;
    subSequence(idx+1, str, newString);
    // count++;
    }
    public static void main(String[] args) {
        subSequence(0, "abcd", "");
    }
    
}

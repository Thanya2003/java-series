package recurrsion;

public class rev {
    public static void printrever(int i, String str){
        if(i==0){
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        printrever(i-1, str);
    }
    public static void main(String[] args) {
        String str="thanya";
        printrever(str.length()-1, str);
    }
}

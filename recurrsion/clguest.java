package recurrsion;

public class clguest {
   
    public static int callguest(int n){
        if(n<=1){
            return 1;
        }
        int single=callguest(n-1);
        int pair=(n-1)*callguest(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        System.out.println(callguest(4));
    }
}

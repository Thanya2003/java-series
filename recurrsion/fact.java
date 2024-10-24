package recurrsion;

public class fact {
    public static int printfact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factnum=printfact(n-1);
        int fact=n*factnum;
        return fact;
        
    }
   public static void main(String[] args) {
      int res = printfact(5);
       System.out.println(res);
   } 
}

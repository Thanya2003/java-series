package recurrsion;

public class pow {
    public static int calpower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        // int powm1=calpower(x, n-1);
        // int pow= x*powm1;
        // return pow;

        if(n%2==0){
            return calpower(x, n/2) * calpower(x, n/2);
        }
        else{
            return calpower(x, n/2) * calpower(x, n/2) * x;

        }

    }
    public static void main(String[] args) {
       int res= calpower(3, 9);
       System.out.println(res);
    }
}

package recurrsion;

public class tiles {
    public static int placetile(int n, int m){
        if(n==m) {
            return 2;
        }
        if(n<m){
            return 1;
        }

        int vertical=placetile(n-m, m);

        int horizontal =placetile(n-1, m);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
       int total= placetile(4, 2);
       System.out.println(total);
    }
    
}

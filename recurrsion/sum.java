package recurrsion;

public class sum {
    public static void sumprint(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumprint(i+1, n ,sum);
    }
    public static void main(String[] args) {
        sumprint(1, 10, 0);
    }
}

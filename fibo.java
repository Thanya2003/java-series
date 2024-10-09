
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter series of fibonacci");
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int a=0;
            int b=1;
            System.out.print("Fibonacci series: "+ a+", "+b);
            for(int i=2; i<n; i++){

                int next= a+b;
                System.out.print(", "+next);
                a=b;
                b=next;
            }
        }
        
    }
    
}

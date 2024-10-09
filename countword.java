
import java.util.Arrays;
import java.util.Scanner;

public class countword {
    public static void main(String[] args) {
        System.out.println("Enter the Statement");
        try (Scanner stri = new Scanner(System.in)) {
            String str=stri.nextLine();
            long count = Arrays.stream(str.split("\\s+")).count();
            System.out.println(count);
        }
    }
    
}

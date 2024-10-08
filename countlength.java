
import java.util.Scanner;

public class countlength {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the statement: ");
            String str=sc.nextLine();

            String[] word = str.trim().split("\\s+");

            int wordcount = word.length;

            System.out.println("Number of Word: "+wordcount);
        }

    }
    
}

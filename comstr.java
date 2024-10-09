import java.util.Scanner;

public class comstr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the first word");
            String string1=sc.nextLine();
            System.out.println("Enter the Second word");
            String string2=sc.nextLine();
            System.out.println(string1.equals(string2));
            System.out.println(string1.equalsIgnoreCase(string2));
            System.out.println(string1.compareTo(string2));
            System.out.println(string1.compareToIgnoreCase(string2));
            // System.out.println(string1.ObjectEquals(string2));


        }
    }
    
}


import java.util.Arrays;
import java.util.Scanner;

public class sortstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sorarr = new String(charArray);
        System.out.println(sorarr);

    }
    
}

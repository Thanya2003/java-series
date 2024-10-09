
import java.util.Scanner;

public class revword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement ");
        String s = sc.nextLine();

        String [] splitword = s.split("\\s+");

        for(int i = splitword.length-1; i>=0; i-- ){
             System.out.print(splitword[i]+" ");
        }

    }

}


import java.util.Scanner;

public class comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String one");
        String s1 = sc.nextLine();
        System.out.println("Enter the String Second");
        String s2 = sc.nextLine();
        boolean iscomp=false;

        if(s1.length()!=s2.length()){
            System.out.println("Two string Must have same length");
        }else{
        for (int i = 0; i <s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i)){
                iscomp=true;
            }
            else{
            iscomp=false;
            }
        }
        if(iscomp){
            System.out.println("Both the strings are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
    }
}

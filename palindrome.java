
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter word, number or pharse");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Cleanin= str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(ispalindrome(Cleanin)){
            System.out.println("The string " +str+" is palindrome");
        }else{
            System.out.println("The string " +str+" is not palindrome");
        }
    }
    public static boolean ispalindrome (String stri){
        int i=0;
        int j=stri.length()-1;
        while(i<j){
            if(stri.charAt(i)!=stri.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    
}

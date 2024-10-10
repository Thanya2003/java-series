
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removedupst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String stri=sc.nextLine();
        String value=removedup(stri);
        System.out.println("After removing duplicate "+value);

    }
    public static String removedup(String str){
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<str.length(); i++){
            Character c = str.charAt(i); 
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

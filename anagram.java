
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String string1=sc.nextLine();
        System.out.println("Enter the Second word");
        String string2=sc.nextLine();

        if(isanagram(string1, string2)){
            System.out.println("The words "+string1+" and "+string2+" are anagrams");
        }else{
            System.out.println("The words "+string1+" and "+string2+" not are anagrams");

        }
        
    }
    public static boolean isanagram(String str1, String str2){
        String clstr1 = str1.replaceAll("[\\s+]", "").toLowerCase();
        String clstr2 = str2.replaceAll("[\\s+]", "").toLowerCase();

        if(clstr1.length()!=clstr2.length()){
            return false;
        }
        char[] charstr1=clstr1.toCharArray();
        char[] charstr2=clstr2.toCharArray();

        Arrays.sort(charstr1);
        Arrays.sort(charstr2);

        return Arrays.equals(charstr1, charstr2);
    }
    
}

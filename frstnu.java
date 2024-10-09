
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class frstnu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Statement");
        String n = sc.nextLine();
        char res= findnum(n);
         if (res!=0){
            System.out.println("First Non repeating Character is "+res);
         }else{
            System.out.println("There is no non repeating character");
         }

    }
    @SuppressWarnings("rawtypes")
    public static char findnum(String str){
        @SuppressWarnings("unchecked")
        Map<Character, Integer> charCountMap = new LinkedHashMap();

        for (char string : str.toCharArray()){
            charCountMap.put(string, charCountMap.getOrDefault(string,0)+1);

        }

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
    
}

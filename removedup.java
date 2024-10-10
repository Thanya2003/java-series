import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removedup {
    public static void main(String[] args) {
        int[] array={1, 2, 2, 3, 3, 4, 5};
        
        int [] res = removeDupInt(array);
        System.out.println(Arrays.toString(res));
    }
    public  static int[] removeDupInt(int[] arr){
        Set<Integer> set= new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }
        int[] res = new int[set.size()];
        int i=0;
        for(int num : set){
            res[i++]=num;
        }
        return res;
    }
}

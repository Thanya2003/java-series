
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrlist {
    public static void main(String[] args) {
        String [] colors={"Red", "Green", "Orange"};
        List list=Arrays.asList(colors);
        System.out.println(list);

        List <String> l = new ArrayList<>();
        // Collections.addAll(l, colors);
        // System.out.println(l);

        for(String str: colors){
            l.add(str);
        }
        System.out.println(l);

    }
}

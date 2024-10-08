
import java.util.Arrays;
import java.util.stream.Stream;

class methodprint {
 public static void main(String[] args) {
     String[] arr={"1.array", "2.stack","3.queue", "4.heap \n"};
     System.out.println("method 1");
     Arrays.asList(arr).forEach(element->System.out.println(element));

     System.out.println("Method 2");
     Arrays.stream(arr).forEach(System.out::println);

     System.out.println("Method 3");
    Stream.of(arr).forEach(ele->System.out.println(ele));


    System.out.println("Method 4");
     for(int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
     }

     System.out.println("Method 5");
     for(String str : arr ) {
         System.out.println(str);
     }

     System.out.println("Method 6");
     System.out.println(Arrays.toString(arr));
 }    
}

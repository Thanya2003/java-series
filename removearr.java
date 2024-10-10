
import java.util.Arrays;
import java.util.Scanner;

public class removearr {

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to remove");
        int delvalue=sc.nextInt();

        int[] arres=deletevalue(arr, delvalue);
        System.out.println("original array"+Arrays.toString(arr));
        System.out.println("After deleting array"+Arrays.toString(arres));
    }

    public  static int[] deletevalue(int[] arr, int delvalue) {

        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==delvalue){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not Found");
            return arr;
        }
        int[] newarr= new int[arr.length-1];
        for(int i=0; i<index; i++){
            newarr[i]=arr[i];
        }
        for(int i=index; i<arr.length-1; i++){
            newarr[i]=arr[i+1];
        }
        return newarr;
    }
    
}

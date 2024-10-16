
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target=sc.nextInt();
        int res=linear(arr, target);
        if(res!=-1){
            System.out.println("Element is present at index "+(res+1));

        }
        else{
            System.out.println("Element is not present in the array");
        }
    }
    public static int linear(int[] arr, int target){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

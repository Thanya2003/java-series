import java.util.Scanner;

public class Bin_search {
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
        int res=Binary(arr, target, 0, arr.length);
        if(res!=-1){
            System.out.println("Element is present at index "+(res+1));

        }
        else{
            System.out.println("Element is not present in the array");
        }
    }
    public static int Binary(int[] arr, int target, int i, int j ){




        if(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target)
                return  mid;
            else if(target<arr[mid])
                return Binary(arr, target, i, mid-1);
            else
             return Binary(arr, target, mid+1, j);

        }

    //    int i=0;
    //    int j=arr.length-1;
    //    while(i<=j){
    //     int mid=(i+j)/2;
    //     if(arr[mid]==target){
    //         return mid;
    //     }
    //     else if(target>arr[mid]){
    //         i=mid+1;
    //     }else{
    //         j=mid-1;
    //     }
    //    }
       return -1;
    }
}

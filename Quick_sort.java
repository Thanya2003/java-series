import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
            }
        sc.close();
            System.out.println("\nBefore Sort");
             for(int a: arr)
             {
                System.out.print(a+" ");
             }
            QuickSort(arr, 0, arr.length-1);
            System.out.println("\nAfter Sort");
            for(int a: arr)
            {
               System.out.print(a+" ");
             }
    }

    public  static void QuickSort(int[] arr, int low, int high) {
       if(low<high){
        int pivot=parition(arr, low, high);
        QuickSort(arr, low, pivot-1);
        QuickSort(arr, pivot+1, high);
       }
    }

    private static int parition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int a=low-1;
        for(int b=low; b<high; b++){
            if(arr[b]<pivot){
                a++;
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
            }
        }
        int temp=arr[a+1];
        arr[a+1]=arr[high];
        arr[high]=temp;

        return a+1;
    }
    
}

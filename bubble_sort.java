import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
            }
            System.out.println("\nBefore Sort");
             for(int a: arr)
             {
                System.out.print(a+" ");
             }

             for (int j= 0; j < n; j++) {
                for(int k=0; k<n-j-1; k++){
                    if(arr[k]>arr[k+1]){
                        int temp=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                    }
                }
                System.out.println();
                for(int a: arr)
                {
                System.out.print(a+" ");
                }
                 
             }

             System.out.println("\nAfter Sort");
             for(int a: arr)
             {
                System.out.print(a+" ");
             }
        
    }
}

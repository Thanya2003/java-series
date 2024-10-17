import java.util.Scanner;

public class selection_sort {
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
             for(int j=0; j<n-1; j++){
                int min=j;
                int temp=0;
                for(int k=j+1; k<n; k++){
                    if(arr[min]>arr[k]){
                        min=k;
                    }
                    temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
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

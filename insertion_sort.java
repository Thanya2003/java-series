import java.util.Scanner;

public class insertion_sort {
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

            for(int j=1; j<n; j++){
                int key=arr[j];
                int k=j-1;
                while (k>=0 && arr[k]>key) { 
                    arr[k+1]=arr[k];
                    k--;
                }
                arr[k+1]=key;
            

            }
            System.out.println("\nAfter Sort");
            for(int a: arr)
            {
               System.out.print(a+" ");
             }
    }
}

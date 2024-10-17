import java.util.Scanner;

public class merge_sort {
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
            
            MergeSort(arr, 0, arr.length-1);


            System.out.println("\nAfter Sort");
            for(int a: arr)
            {
               System.out.print(a+" ");
             }
    }

    public static void MergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            MergeSort(arr, l, mid);
            MergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }

    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;

        int[] larr= new int[n1];
        int[] rarr= new int[n2];

        for(int x=0; x<n1; x++){
            larr[x]=arr[l+x];
         }
        for(int x=0; x<n2; x++){
            rarr[x]=arr[mid+1+x];
         }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;

        }
        while(i<n1){
            arr[k]=larr[i]; 
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }

    

}

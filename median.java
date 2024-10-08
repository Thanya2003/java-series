import java.util.Arrays;

public class median{
    public static void main(String[] args) {
        int [] arr={12, 8, 9, 10, 4, 5};
        double median= medianfinder(arr);
        System.out.println("Median: "+median);
    }
    public static double medianfinder(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        if(n%2==1){
            return arr[n/2];
        }
        else{
            return (double)((arr[n/2-1]+arr[n/2])/2.0);
        }
    }
    
}

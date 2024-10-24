package recurrsion;

public class sort {
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            isSorted(arr, idx+1);
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 8, 9};
        if(isSorted(arr, 0)) {
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        } 
        }
    
}

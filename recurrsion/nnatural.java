package recurrsion;

import java.util.ArrayList;

public class nnatural{
    public static void printsub(ArrayList<Integer> arr){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+"");
        }
        System.out.println();
        
    }
    public static void  findsubset(int n, ArrayList<Integer> arr){
        if(n==0){
            printsub(arr);
            return;
        }
        arr.add(n);
        findsubset(n-1, arr);

        arr.remove(arr.size()-1);
        findsubset(n-1, arr);
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr= new ArrayList<>();
        findsubset(4, arr);
    }
}
package recurrsion;

public class nm {
    public static int countpaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downpaths= countpaths(i+1, j, n, m);
        int rightpaths= countpaths(i, j+1, n, m);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int tt=countpaths(0, 0, 3, 4);
        System.out.println(tt);
    }
}

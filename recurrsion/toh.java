package recurrsion;
public class toh {
    public static void towerOfhonnai(int n, String Source, String Helper, String Destination){
        if(n==1){
        System.out.println("Transfer the Disk "+n+" From "+Source+" to "+Destination);
        return;
        }
        towerOfhonnai(n-1, Source, Destination, Helper);
        System.out.println("Transfer the Disk "+n+" From "+Source+" to "+Destination);
        towerOfhonnai(n-1, Helper, Source, Destination);
    }
    public static void main(String[] args) {
        towerOfhonnai(3, "S", "H", "D");
    }
    
}

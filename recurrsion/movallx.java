package recurrsion;

public class movallx {
    public static void  movAllX(int index, String str, int count, String newString){
       if(index==str.length()){
        for(int i=0; i<count; i++){
            newString+='x';
        }
        System.out.println(newString);
        return ;
       }
         char currele=str.charAt(index);
        if(currele=='x'){
            count++;
            movAllX(index+1, str, count, newString);
        }
        else{
            newString+=currele;
            movAllX(index+1, str, count, newString);
            

        }
    }
    public static void main(String[] args) {

        movAllX(0, "axbxbexxvd", 0, "");
    }
    
}

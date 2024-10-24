package recurrsion;

public class ocu {
    public static int frst =-1;
    public static int last =-1;
    public static void findocc(int idex, char ele, String str){
        if(idex==str.length()){
            return;
        }
        char curele=str.charAt(idex);
        if(curele==ele){
        if(frst==-1){
            frst=idex;
        }else{
            last=idex;
        }
    }
        findocc(idex+1, ele, str);
}
    public static void main(String[] args) {
        String str="aaabbabdea";
        findocc(0, 'a', str);
        System.out.println(frst+1);
        System.out.println(last+1);
    }
    
}

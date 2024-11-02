package recurrsion;

import java.util.ArrayList;
import java.util.List;

public class nqueen {
    public boolean isSafe(int row, int col, char[][] boards){
        for(int j=0; j<boards.length; j++){
            if(boards[row][j]=='Q'){
                return false;
            }
        }
        for(int i=0; i<boards.length; i++){
            if(boards[i][col]=='Q'){
                return false;
            }
        }
       
        int r= row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        r=row;
        for(int c=col; c<boards.length && r>=0; c++, r--){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        r= row;
        for(int c=col; c>=0 && r<boards.length; c--, r++){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        r= row;
        for(int c=col; c<boards.length && r<boards.length; c++, r++){
            if(boards[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void savebo(char[][] board, List<List<String>> allBoard){
        String row="";
        List<String> NEWboard = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            row="";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            NEWboard.add(row);
        }
        allBoard.add(NEWboard);
    }
    public void hepler(List<List<String>> allBoard, char[][] boards, int col) {
        if(col==boards.length){
            savebo(boards, allBoard);
            return;
        }
        for(int row=0; row<boards.length; row++){
            if(isSafe(row, col, boards)){
                boards[row][col]='Q';
                hepler(allBoard, boards, col+1);
                boards[row][col]='.';

            }
        }
    }
    public List<List<String>> sloveNqueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] Boards = new char[n][n];
        hepler(allBoard, Boards, 0);
        return allBoard;
    }
    public static void main(String[] args) {
        nqueen nq= new nqueen();
        List<List<String>> slou =nq.sloveNqueens(4);
        for(List<String> slous: slou){
            for(String row : slous){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

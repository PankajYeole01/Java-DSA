import java.util.*;
public class N_queens {
    public static void main(String args[]){
        int n=2;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueens(board,0);

    }
    public static void nqueens(char board[][],int row){
        if(row == board.length){
            printboard(board);
            return;
        }
        for(int i=0;i<board.length;i++){
            
            if(issafe(board,row,i)){
                
                board[row][i]='Q';
                nqueens(board,row+1);
                board[row][i]='X';  
            }
            
        }

    }
    public static void printboard(char board[][]){
        System.out.println("-----chess board ----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean issafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }

        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}

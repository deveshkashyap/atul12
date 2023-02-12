import java.util.*;

public class root{
    public static boolean isvalid(int[][] chess, int row, int col){

        // Checking the row
        for(int i = row - 1, j = col; i >= 0 ; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        // Checking the colums.
        for(int j = col - 1, i = row; j >= 0; j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        // Checking the diagonal 1.
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        // checking the diagonal 2.
        for(int i = row - 1, j = col + 1; i >=0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    // This is the required funtions.
    public static boolean check(int[][] board){
        int n = board.length;
        int p = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    if(isvalid(board, i, j)){
                        p++;
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(p == n){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        int board[][] = {{0, 0, 1, 0}, {1, 0, 0, 0}, {0, 0, 0, 1}, {0, 1, 0, 0}};
        if(check(board)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
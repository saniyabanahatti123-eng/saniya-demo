
                return;
            }
            for (int row = 0; row<board.length; row++) {
                if (isok (row ,col,board)) { 
                    board[row][col] = 'Q'; // add
                    solve(board,col+1); //recurse(For next column)
                    board[row][col]='.'; // remove
                }
            }

        }
        public void printboard(char[][] board) {
            for (int i=0;i<board.length; i++) {
               for (int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+""); //print the compleate board
               } 
               System.out.println();
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int n = 4;
            char[][] board = new char[n][n];
                        for (int i=0;i<board.length; i++) {
               for (int j=0; j<board.length; j++) {
                board[i][j]='.';import java.util.*;
public class Nqueenbackatack{
    public boolean isok(int row ,int col, char [][] board){
        // check leFt row
        for (int j=0;j<row;j++ ) {
            if (board[row][j]=='Q') {
                return  false;
            }
        }
        // check upper-leFt daigonoal
        for (int i=row ,j=col; i>=0 && j>=0; i-- ,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        // check lower LeFt daigonal
        for (int i=0,j=0; i<board.length && j>=0; i++,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
            return true;
        }
    
        public void solve(char board[][] , int col) {
            if (col==board.length) { //base case
                printboard(board); // store
               }
            }
            Nqueenbackatack obj = new
            Nqueenbackatack(); 
            obj.solve (board , 0);
            
        }
    }

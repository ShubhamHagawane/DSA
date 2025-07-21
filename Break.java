import java.util.*;

// keep entering number till user enter multiple of 10

public class Break {

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
       

    //     do{
    //          System.out.print("enter your number:");
    //          int n = sc.nextInt();
           

    //          if (n % 10 ==0){
    //             continue;
    //          }
    //          System.out.println(n);
    //     }while(true);
        
    // }


    }
    

    public static void nQueen(char board[][] , int row){

        if(row == board.length){
            printBoard(board);
            return;
        }
        
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueen(board, row+1);
            board[row][j] = '.';
        }
    }
    
    public static void printBoard(char board[][]){
        System.out.println("----chessBoard----");
        for (int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void main (String args[]){
        int n = 4;
        char board [][] = new char [n][n];
        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueen(board , 0);
    }
    
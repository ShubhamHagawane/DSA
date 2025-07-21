public class backtracking {

    // backtracking on arrays 

    // public static void changearr(int arr[], int i , int val){
    //     // base case if
    //     if(i==arr.length){
    //          printarr(arr);
    //          return;
    //     }
    //     //recursion 
    //     arr[i] = val ; 
    //     changearr(arr , i+1 , val+1); 
    //     arr[i] = arr[i] - 2;  //backtracking step 
        
    // }

    // public static void printarr(int arr[]){  //print array
    //     for (int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }


    // public static void main(String args[]){
    //     int arr[] = new int [5]; 
    //     changearr(arr , 0 , 1); 
    //     printarr(arr);
    // }
}

// find subset

// public static void findsubset(String str , String ans , int i){

//     // base case 
//     if(i==str.length()){
//         if(ans.length() ==0){
//             System.out.println("null");
//         }else{
//             System.out.println(ans);
//         }
//         return; 
//     }

//     // recursion

//     // yes choice
//     findsubset(str, ans+str.charAt(i), i+1);
//     // no choice
//     findsubset(str, ans, i+1);
// }

// permutation of string 

// public static void permutation(String str , String ans){
//     if(str.length()==0){
//         System.out.println(ans);
//         return;
//     }
//     for(int i=0; i<str.length(); i++){
//         char curr = str.charAt(i);
//         String newstr = str.substring(0,i) + str.substring(i+1);
//         permutation(newstr, ans+curr);
//     }
// }
// n queen problem

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
// public static void main (String args[]){
//     int n = 4;
//     char board [][] = new char [n][n];
//     // initialize
//     for(int i=0; i<n; i++){
//         for(int j=0; j<n; j++){
//             board[i][j] = '.';
//         }
//     }
//     nQueen(board , 0);
// }

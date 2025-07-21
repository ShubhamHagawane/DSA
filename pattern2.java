
    
// // import java.util.*;

// public class pattern2 {

//     // // hollowrectangle
//     // public static void hollowrect( int row , int col ){
//     //     for (int i=1; i<= row; i++){
//     //         for(int j=1; j<=col; j++){
//     //             if(i==1 || i==row || j==1 || j==col){
//     //                 System.out.print("*");
//     //             }else{
//     //                 System.out.print(" ");
//     //             }
//     //         }
//     //         System.out.println();
//     //     }
            

//     // }

//     // // invrted rotated triangle

//     // public static void inverted_rotated_triangle (int n){
//     //     for(int i = 1; i<=n; i++){
//     //         for (int j=1; j<=n; j++){
//     //             if(i+j>=n+1){
//     //                 System.out.print("*");
//     //             }else System.out.print(" ");
//     //         }
//     //         System.out.println();
//     //     }
        
//     // }


//     // inverted_half_pyramid_number 

//     public static void inverted_half_pyramid_number (int n){
//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=n-i+1; j++){
//                 System.out.pirnt(j + " ");
//             }
//             System.out.println();
//         }
        
//     }

//     // floyds triangle

//     public static void floyds_triangle(int n){
//         int counter = 1;
//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(counter + " ");
//                     counter++;

//             }
//             System.out.println();
//         }

//     }

//     // 0 -1 triangle

//     public static void zero_one_triangle(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if ((i+j)%2 ==0){
//                     System.out.print("1");
//                 }else System.out.print("0");
//             }
//                 System.out.println();
//         }

//     }


//     // butterfly pattern 

//     public static void butterfly(int n){

//         // first half
//         for(int i=1; i<=n; i++){
          
//             // second half

//             for(int i=n; i>=1; i--){

//             }
//         }
//     }


//     // solid rhombos
//     public static void rhombos(int n){

//     for(int i=1; i<=n; i++){
//         // space
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=n; j++){
//             System.out.print("*");
//     }   
          
//         System.out.println();
// }
//     }

//     // hollow rhombos 


//     public static void holowrhombus(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }


    // dimond shape

    public static void dimond(int n){
        for (int i=1; i<=n; i++){
            for (j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2 i - n); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main (String args[]){
       
        dimond(4);
    }}

public class patterns { 
    public static void main(String args[]){

        // for(int line=1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // inverted

        // for(int line=1; line<=4; line++){
        //     int n = 4;
        //     for(int s=1; s<=(n-line+1); s++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    //    CHRACTER

        // int n = 4;
        // char ch = 'A';

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }


        // half pyramid 

        // int n = 5;

        // for(int i=n; i>=1; i--){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        // }

        // square

        // int n = 5;

        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=n; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // bottom left triangle 

        // int n = 5;

        // for(int row = 1; row<=n; row++){
        //     for(int col = 1; col<=n; col++){
        //         if(row - col >=0){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // top right column

        
        int n = 5;
        

        for(int row = 1; row<=n; row++){
            
            for(int col = 1; col<=n; col++){
                if(row - col >=0){
                    System.out.print("row ");
                }
                else System.out.print(' ');
        
            }
            System.out.println();
        }

    // 


        
        

        
        }
        
    
}



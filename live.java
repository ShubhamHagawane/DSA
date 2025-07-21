import java.util.Scanner;

public class live {
    
      public static void main(String args[]){
        // int rev = 0;
        // int n = 10899;
        // while (n>0) {
        //     int lastDigit = n % 10;
        //     n = n /10;
        //    rev = (rev*10) + lastDigit;
        // }
        // System.out.println(rev);
        

        Scanner sc = new Scanner (System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();

          if (n==2){
            System.err.println("n is pirme ");
          }
          else{
            boolean isprime = true;
              for (int i=2; i<Math.sqrt(n); i++){
                  if(n % i ==0){
                    isprime = true;
                  }
                  else{
                    isprime = false;
                  }
              }
        }
      }


        // for (int i=5; i>=1; i--){

        //     for(int x=1; x<i; x++){
        //         System.out.print(" ");
        //     }
        //     for(int j=5; j>=i; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 2nd pattern

        // for(int i=1; i<=5; i++){
        //     for(int x=5; x>i; x--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

       
        

    }


    


// import java.util.*;

// public class JavaBasic {

//     public static void main(String args []){
        // Scanner sc =new Scanner(System.in);

        // income tax calculator

//         int income = sc.nextInt();
//         int tax;

//         if (income<500000) {
//             tax = 0;

            
//         }
//         else if(income >= 500000 && income < 1000000){
//             tax = (int) (income * 0.2);
            
//         }
//         else {
//             tax = (int) (income * 0.3);

//         }
//         System.out.print("your tax is:" + tax);

//     }
// }

        // largest of 3 number  

    //     int a =1;
    //     int b =3;
    //     int c =6;

    //     if(a >= b && a >= c){
    //         System.out.print("largest is a:"  );
    //     }
    //     else if(b >= c){
    //         System.out.print("largest is b:" );

    //     }
    //     else{
    //         System.out.print("largest is c:");
    //     }
    // }}

   
    import java.util.*;
    public class JavaBasic{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.err.println("enter a:");
            int a = sc.nextInt();
            System.out.println("enter b:");
            int b = sc.nextInt();
            System.out.println("enter operator:");
            char operator = sc.next().charAt(0);

            switch(operator){
                case '+' : System.out.println(a+b);
                            break;
                case '-' : System.out.println(a-b);
                            break;
                case '*' : System.out.println(a*b);
                            break;
                case '/' :System.out.println(a/b);
                            break;
                default:   System.out.println("error");                    
            }
        }
        
    }
public class function {

    // public static void swap(int a, int b){
        
    //     // swap
    //     int temp=a;
    //     a=b;
    //     b=temp;

    //     System.out.println("a=" +a );
    //     System.out.print("b=" +b );

    // }

    // // public static void main(String args[]){
    //     int a = 5;
    //     int b = 10;
    //     swap(a,b);

    
    

    // public static boolean isPrime(int n){
    //     if(n==2){
    //        return true;
    //     }
    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n % i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }   


    // // prime no in range
    // public static void primesInrange(int n){
    //     for(int i=2; i<=n; i++){
    //         if(isPrime(i)){
    //             System.out.print(i +" ");
    //         }
    //     }
    // }

    // // // binary to decimal

    // public static void BinToDec(int binNum){
    //     int pow =0;
    //     int decnum = 0;

    //     while( binNum >0){
    //         int lastdigit = binNum %10;
    //         decnum +=lastdigit * (int) Math.pow(2 , pow);

    //         pow++;
    //         binNum/=10;
    //     }
    //     System.out.println(binNum);
    // }


    // // decimal to binary
    public static void dectoBin(int n){
        int pow = 0;
        int binNum = 0;
        while(n > 0){
            int rem = n % 2;
            binNum = binNum +(int)(rem * Math.pow(10 , pow));
            pow++;
            n = n / 2;

        }
        System.out.println(binNum);
    }

    // factorial of number

    // public static int factorial(int n){
    //     int f= 1;

    //     for (int i=1; i<=n; i++){
    //         f*=i;
    //     }
    //     return f;
    // }

    // Binomial coefficient
    // public static int Binomial (int n , int r){
    //     int n_fact= factorial(n);
    //     int r_fact = factorial(r);
    //     int nmr_fact = factorial(n - r);

    //     int B_C = n_fact / (r_fact * nmr_fact);
    //     return B_C;
    // }


    public static void main(String args[]){
      

    }





}

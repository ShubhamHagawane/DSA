
public class recursion1 {

    // print number in decresing order

    public static void printdec(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.err.print(n +" ");
        printdec(n-1);
    }

    // print number in increasing order


    public static void printinc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printinc(n-1);
        System.out.println(n +" ");
    }

    // print fatorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n* fnm1;
        return fn;
    }

    // calculate sum of first natural number 

    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calcsum(n-1);
        int sn = n+ snm1;
        return sn;
    }

    // fibonnachi number
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fbnm1 = fib(n-1);
        int fbnm2 = fib(n-2);
        int fn = fbnm1+ fbnm2;

        return fn;
    }

    public static boolean issorted (int arr[] , int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        

        return issorted(arr, i+1);
    }

    // search for first occurence

    public static int FO(int arr[] ,  int key ,int i){
        if(arr[i]==arr.length){
            return -1;   
        }
        if(arr[i]==key){
            return i;
        }
        return FO(arr, key, i+1);
    }

    // search for last occurance

    public static int LO(int arr[] , int key , int i){
        if (i==arr.length){
            return -1;
        }
        int isfound = LO(arr, key, i+1);
        if (isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    // calculate the power by time complexity o(n)

    public static int power1(int x , int n){
        if(n==0){
            return 1;
        }
        int pnm1 = power1(x, n-1);
        int p = x * pnm1;

        return p;
    }

    // calculate poer by time comlexity o(logn)
    
    public static int power2(int x , int n){
        if(n==0){
            return 1;
        }
        // half power (when power is even)
        int halfpower =power2(x, n/2) ;   //calculate x^n
        int halfpowersq =halfpower*halfpower;
        // (when power is odd)
        if(n%2!=0){
            return x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main (String args[]){
        int arr [] ={1,2,3,4,5,6,7,4,5};
        System.out.println(power2(2, 10)); 
    }
}
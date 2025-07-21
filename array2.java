public class array2 {
//    To find max sum of subarray
        // public static int subarray(int number[]){
        //     int currsum = 0;
        //     int maxsum = Integer.MIN_VALUE;


        //     for(int i=0; i<number.length; i++){
        //         int first = i;
        //         for (int j=i; j<number.length; j++){
        //             int last = j;
                
        //         for(int k=first; k<=last; k++){
        //             currsum += number[k];
        //         }
        //         System.out.println(currsum);
        //         if(maxsum<currsum){
        //             maxsum=currsum;
        //         }
                
        //     }
        //     System.out.println("max sum:" +maxsum);
        // }
        
        // return-1;
        // }
        // public static void main(String args[]){
        //     int number[] = {2,3,4,5,6};
        //     subarray(number);
             
        // }

        // max subarray using prefix array
        // public static int subarray(int number[]){
        //     int currsum = 0;
        //     int maxsum = Integer.MIN_VALUE;
        //     int prifix []= new int[number.length];

        //     prifix[0]= number[0];
        //     // aclculate prefix array
        //     for (int i=1; i<prifix.length; i++){
        //         prifix[i]= prifix[i-1] + number[i];
        //     }

        //     for(int i=0; i<number.length; i++){
        //         int first = i;
        //         for (int j=i; j<number.length; j++){
        //             int last = j;
                
        //             currsum = first==0? prifix[last] : prifix[last] -prifix[first-1];
        //         System.out.println(currsum);
        //         if(maxsum<currsum){
        //             maxsum=currsum;
        //         }
                
        //     }
        //     System.out.println("max sum:" +maxsum);
        // }
        
        // return-1;
        // }

        // kadanes algorithm

       public static void kadanes(int number[]){
            int maxsum = Integer.MIN_VALUE;
            int currsum = 0;

            for (int i=0; i<number.length; i++){
                    currsum+= number[i];
                    if(currsum<0){
                        currsum=0;
                    }
                    maxsum=Math.max(currsum,maxsum);
            }

            System.out.println(maxsum);
       } 
        public static void main(String args[]){
            int number[] = {-1,-2,-3,-4};
            kadanes(number);
            
        }
        
    }


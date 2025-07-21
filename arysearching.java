import java.util.*;

public class arysearching {

    // public static int linearsearch(int numbers[], int key) {
    //     for(int i=0; i<numbers.length; i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String args[]){
    //     int numbers [] ={2,4,6,8,10,12,14,16};
    //     int key = 10;
    //     int index = linearsearch(numbers, key);

    //     if(index==-1){
    //         System.out.println("not found");
    //     }else{
    //         System.out.println("key is found at index :"+ index);
    //     }
    // }

    // largest number in given array


//     public static int getlargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int samallest = Integer.MAX_VALUE;

//         for (int i=0; i<numbers.length; i++){
//             if (largest < numbers[i]){
//                 largest=numbers[i];
//             }
//             if(samallest>numbers[i]){
//                 samallest=numbers[i];
//             }
//         }
//         System.out.println("smallest is:"+samallest);
//         return largest;
//     }

//         public static void main(String[] args) {
//         int numbers[] = {1,2,6,3,5};
//         System.out.println("largest is:" + getlargest(numbers));
//     }

        // binary search

    //     public static int binarysearch(int numbers[], int key){
    //         int start = 0 , end = numbers.length-1 ;

    //         while (start<=end) {
    //             int mid = (start + end )/2;

    //             if(numbers [mid] ==key){
    //                 return mid;
    //             }
    //             if(numbers [mid] <key){
    //                 start=mid+1;
    //             }
    //             else{
    //                 end = mid -1;
    //             }
    //         }
    //         return -1;
    //     }

    // public static void main(String args[]){
    //      int numbers[] = {2,4,6,8,10,12,14,16};
    //     int key = 2;
    //     System.out.println("index for key:" + binarysearch(numbers, key));
    // }
    


    // reverse array

    // public static void reverse(int numbers[]){
    //     int first=0, last=numbers.length;
    //     while (first<last) {
    //         int temp = numbers[last];
    //         numbers[last]=numbers[first];
    //         numbers[first]=temp;
            
    //         first++;
    //         last--;
    //     }
       
    // }

    // public static void  main(String args[]){
    //      int numbers []= {2,4,6,8,10};
    //      reverse(numbers);
    //      for(int i=0; i<numbers.length; i++){
    //         System.out.print(numbers[i]+" ");
    //      }
    //      System.out.println();
    // }
    

    // pairs

    public static void printpairs(int numbers[]){
        int tp =0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr +","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("total pairs ="+tp);
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printpairs(numbers);
    }
}
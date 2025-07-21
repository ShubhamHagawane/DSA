// import java.util.*;

public class array {
    // public static void main(String args[]){
    //     int marks[] = new int[100]; 

    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("length of arry:" + marks.length);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy :" + marks[0]);
        // System.out.println("chem :" + marks[1]);
        // System.out.println("math :" + marks[2]);

        // int percentage = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("percentage :"+ percentage + "%");

        
        // public static void update(int marks[]){
        //     for(int i=0; i<marks.length; i++){
        //         marks[i] = marks[i] + 1; 

        //     }
        // }
        // public static void main(String args[]){
        //     int marks[] = {97,98,99};
        //     update(marks);
        //     for(int i=0; i<marks.length; i++){
        //         System.out.print(marks[i] + " ");
        //     }
        //     System.out.println();
        // }
    //     public static int linearsearch(int number[], int key){
    //         for(int i=0; i<numbers.length; i++){
    //             if(numbers[i] == key){
    //                 return i;
    //             }
    //         }
    //         return -1 ;
    //     }

    //     public static void main(String args[]){
    //         int numbers [] = {2,4,6,8,10,12,14};
    //         int key = 10;

    //         int index = lenearsearch(numbers , key);
    //         if (index ==-1){
    //             System.out.print("key is not found");
    //         }else{
    //             System.out.print(index);
    //         }
    



//    largestnumber in array

// public static int getlargest(int number[]){
//     int largest =Integer.MIN_VALUE;

//     for(int i=0; i<number.length; i++){
//         if (largest< number[i]){
//             largest = number[i];
//         }
//     }
//     return largest;
// }
// public static void main (String args[]){
//     int number[] = {2,4,6,8};
//     System.out.println(getlargest(number));
// }


// binary searchbinary

// public static int binarysaearch(int number[] ,int key){
//     int start=0; int end=number.length-1;
//     while (start<=end ){
//        int mid =( start+end)/2;

//         if (number[mid]==key ){
//             return mid ;
//         }if (number[mid] <key){
//             start=mid +1;
//         }else{
//             end =mid -1;
//         }
//     }
//     return-1;
// }

// public static void main (String args[]){
//     int number[] ={2,4,6,8};
//     int key= 2;
//     System.out.println(binarysaearch(number, key));
// }

// reverse array

// public static int reverse(int number[]){
//     int first=0;
//     int last = number.length-1;

//     while(first<last){

//         int temp = number[last];
//         number[last]= number[first];
//         number[first]=temp;

//         first++;
//         last--;
//     }
//     return -1;
// }
// public static void main(String args[]){
//     int number [] ={2,3,5,6};
//     reverse(number);
//     for(int i=0; i<number.length;i++){
//         System.out.print(number[i]+"  ");
//     }
//     System.out.println();
// }
    
// pairs in array


// public static int pairs(int number[]){
//     for(int i=0; i<number.length; i++){
//         int curr =number[i];
//         for(int j=i+1; j<number.length; j++){
//             System.out.print("(" + curr +","+number[j]+ ")");
//         }
//         System.out.println();
//     } 
//     return -1;
    
// }
// public static void main(String args[]){
//     int number []={2,3,4,5,6};
//     pairs(number);

// sub array

public static int subarray(int number[]){
    for(int i=0; i<number.length; i++){
        int first = i;
        for (int j=i; j<number.length; j++){
            int last = j;
        
        for(int k=first; k<=last; k++){
            System.out.print(number[k]+"  ");
            
        }
        System.out.println();
    }
    System.out.println();
}

return-1;
}
public static void main(String args[]){
    int number[] = {2,3,4,5,6};
    subarray(number);
    
}
}
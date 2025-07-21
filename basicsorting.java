public class basicsorting {
    // BUBBLE SORT


    // public static void bubble(int array[]){
    //     for (int turn=0; turn<array.length; turn++){
    //         // int swap =0;
    //         for (int j=0; j<array.length-1-turn; j++){
    //             if(array[j]>array[j+1]){

    //                 int temp =array[j];
    //                 array[j] =array[j+1];
    //                 array[j+1] =temp;
    //                 // swap++;
    //                 // System.out.print(swap);
    //             }
    //         }
    //     }
    // }

    public static void printarr(int array[]){
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println();
        
    }

    //selection sort 

    public static void selection(int array[]){
        for(int i=0; i<array.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<array.length; j++){
                if(array[minpos] < array[j]){
                    minpos=j;
                }
            }

            int temp =array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }

    // insertion sort
    public static void insertion (int array[]){
        for (int i=1; i<array.length; i++){
            int curr = array[i];
            int prev = i-1;

            while(prev>=0 && array[prev]>curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }

    
    public static void main(String args[]){
        int array[] = {1,2,3,4,5};
        insertion(array);
        printarr(array);
    }
}

public class divideconq {

    // MERGE SORT
    // public static void printarr(int arr[]){
    //     for (int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] +" ");
    //     }
    //     System.out.println();
    // }

    // public static void mergesort(int arr[] , int si , int ei){
    //     if ( si >= ei){
    //         return ; 
    //     }
    //     int mid = si + (ei - si)/2 ; //mid part 
    //     mergesort(arr, si, mid); //left part
    //     mergesort(arr, mid+1, ei);// right part
    //     merge(arr , si , mid , ei);
    // } 
    // public static void merge(int arr[] , int si ,int mid , int ei){
    //     int temp[] = new int [ei - si +1];
    //     int i = si ; 
    //     int j = mid + 1;
    //     int k = 0; 

    //     while (i <= mid && j <=ei){
    //         if (arr[i] < arr [j]){
    //             temp[k] = arr[i];
    //             i++;
    //         }else{
    //             temp[k]=arr[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     // left part 
    //     while (i<= mid){
    //         temp[k++]=arr[i++];
    //     }

    //     // right part 
    //     while (j<= ei){
    //         temp[k++] = arr[j++]; 

    //     }

    //     // copy temp to original arr

    //     for (k=0 , i=si ; k<temp.length; k++ ,i++){
    //         arr[i]=temp[k];
    //     }
    // }

    // QUICK SORT
    // public static void quicksort(int arr[] , int si , int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     // last index 
    //     int pIdx = partition (arr, si ,ei);
    //     quicksort(arr, si, pIdx-1);//LEFT
    //     quicksort(arr, pIdx+1, ei);//RIGHT

    // }
    // public static int partition(int arr[] , int si , int ei){
    //     int pivot = arr[ei];
    //     int i = si -1; //to make place for elelments smaller than pivot 

    //     for (int j=si; j<ei ;j++ ){
    //         if (arr[j] <= pivot ){
    //             i++;
    //             //swap
    //             int temp = arr [j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    //     i++;
    //     int temp = pivot ;
    //     arr[ei] = arr[i];
    //     arr[i] = temp;
    //     return i;
    // }

    //search in rotated sorted array

    public static int search(int arr[], int tar , int si , int ei){
        if(si>ei){
            return-1;
        }

        // mid
        int mid = si+(ei - si)/2;

        if (arr[mid]==tar){
            return mid;
        }

        if (arr[si]<=arr[mid]){
            // case a:
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    
    public static void main (String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target =0;
        int tarInx = search(arr , target, 0 , arr.length);
        System.out.println(tarInx);
    }
}

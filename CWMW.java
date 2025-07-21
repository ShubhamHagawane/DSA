import java.util.ArrayList;
import java.util.List;

public class CWMW {
    // bruteforce Approach - {o(n^2)}
    // public static int pair(ArrayList<Integer>   List){
    //     int maxWater = 0;
    //     for(int i=0; i<List.size(); i++){
    //         for(int j=i+1; j<List.size(); j++){
    //             int height = Math.min(List.get(i) , List.get(j));
    //             int Width = j-i;
    //             int currWater = height * Width;
    //             maxWater = Math.max(maxWater, currWater);
    //             }

    //         }
    //         return maxWater;
    //     }
    
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(8);
        List.add(6);
        List.add(2);
        List.add(5);
        List.add(4);
        List.add(8);
        List.add(3);
        List.add(7);

        System.out.println(pair(List));
    }
}

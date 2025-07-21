import java.util.*;
public class heap {
    static class heappp {
        ArrayList<Integer>arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1; //idx of child
            int par = (x-1)/2; // idx of par

            while(arr.get(x)<arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par , temp);
            }
        }

        public int peak(){
            return arr.get(0);
        }
    }
    public static void main (String args[]){

    }
}

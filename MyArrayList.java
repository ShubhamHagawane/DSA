import java.util.*;

import javax.swing.text.html.parser.Element;

public class MyArrayList {
    // public static void main(String args[]){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ArrayList<String> list2 = new ArrayList<>();
    //     ArrayList<Boolean> list3 = new ArrayList<>();

    //     // add element operation {o(1)}
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);

        // list.add(1,9);  //o(n) time complaxity for this add operation

        // System.out.println(list.size()); //printing size of ArrayList

        //loop in AL
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }

        // reverse loop in AL
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }

        // Find max in AL - {o(n)}

        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<list.size(); i++){
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        // }
        // System.out.println("Max element is:"+ max);


        
        // get operation{o(1)}

        // int element = list.get(1);
        // System.out.println(element);


        // remove element {o(n)}

        // list.remove(2);
        // System.out.println(list);

        // set element at index -{o(n)}

        // list.set(2, 10);
        // System.out.println(list);

        // cotains element -{o(n)}

        // System.out.println(list.contains(1));

    // }

    // public static void swap(ArrayList<Integer> list , int idx1 ,int idx2){
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);

        
    // }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // int idx1 = 1, idx2 =3;
        // System.out.print(list);
        // swap(list, idx1, idx2);

        // System.out.print(list);
        

    }
}

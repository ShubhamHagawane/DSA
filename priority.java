import java.util.*;


public class priority {

    static class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name, int rank){
            this.name = name ;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
        
    }
    public static void main (String args[]){
        PriorityQueue<student>pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new student("a ", 12));
        pq.add(new student("r ", 32));
        pq.add(new student(" g", 1));
        pq.add(new student("h ", 02));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"->" + pq.peek().rank);
            pq.remove();
        }
    }
}

import java.util.*;
public class JCFPQ {
     //java collection framework implementation of priority queue
    public static void main(String args[]){
        //smaller to larger removal of numbers
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(3);
        pq.add(5);
        pq.add(6);
        pq.add(8);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
        //larger to smaller number 
        System.out.println("Reverseorder");
        PriorityQueue<Integer> qp = new PriorityQueue<>(Comparator.reverseOrder());
        qp.add(10); 
        qp.add(3);
        qp.add(5);
        qp.add(6);
        qp.add(8);
        while(!qp.isEmpty()){
            System.out.println(qp.remove());
        }

    }
}

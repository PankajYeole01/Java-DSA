import java.util.*;
public class JCFPQstoringobject {
    static class student implements Comparable<student>{
        String name;
        int rank;
        public student(String name,int rank){
            this.name = name;
            this.rank =rank;
        }
       
        @Override
        //overriding to sort objects lexicographically
        public int compareTo(student s2){
            int l1 = this.name.length();
            int l2 = s2.name.length();
            int min = Math.min(l1, l2);
            int i=0;
            while(i<min){
                if (this.name.charAt(i)!= s2.name.charAt(i)){
                    return this.name.charAt(i)-s2.name.charAt(i);
                }
                i++;
            }
            return l1-l2;
        }


    }
    public static void main(String args[]){
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student ("D",12));
        pq.add(new student ("BC",1));
        pq.add(new student ("B",4));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
        
        
    }

}

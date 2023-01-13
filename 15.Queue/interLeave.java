import java.util.*;
public class interLeave {
    public static void makeInterleave(Queue <Integer>q){
        Queue <Integer> firstHalf = new ArrayDeque<>();
        int size = q.size();
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

    }
    public static void main(String args[]){
      Queue <Integer> q = new ArrayDeque<>();
      for(int i=1;i<=10;i++){
        q.add(i);
      }
      makeInterleave(q);
      while(!q.isEmpty()){
        System.out.print(q.remove()+" ");
      }
    }
}

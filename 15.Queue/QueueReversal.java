import java.util.*;
public class QueueReversal {
    public static void reverse(Queue <Integer> q){
       Stack<Integer> s = new Stack<>();
       while(!q.isEmpty()){
        s.push(q.remove());
       }
       while(!s.isEmpty()){
        q.add(s.pop());
       }
    }
   public static void main(String args[]){
   Queue <Integer> q = new ArrayDeque<>();
    for(int i=0;i<5;i++){
        q.add(i);
    }
    reverse(q);
    while(!q.isEmpty()){
        System.out.print(q.remove()+" ");
    }
    
   }

}

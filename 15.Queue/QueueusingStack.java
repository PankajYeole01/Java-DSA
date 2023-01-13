import java.util.*;
//push - O(n)
public class QueueusingStack {
    public static class queue{
         static Stack<Integer> s1 = new Stack<>();
         static Stack<Integer> s2 = new Stack<>();
         public static boolean isEmpty(){
            return s1.isEmpty();
         }
         public static void add(int data){
            while(!isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
         }
         public static int remove(){
            return s1.pop();
         }
    }
    public static void main(String args[]){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
    }
}

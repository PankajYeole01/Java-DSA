import java.util.*;
//pop-O(n)
public class QueueusingStack2{
    public static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
              s1.push(data);
        }
        public static int remove(){
              if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
              }
              while(!s1.isEmpty()){
                  s2.push(s1.pop());
              }

              return s2.pop();

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

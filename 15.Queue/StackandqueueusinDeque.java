import java.util.*;
public class StackandqueueusinDeque {
    static class stack{
        static Deque<Integer> deque = new ArrayDeque<>();
        public static void push(int data){
            deque.addLast(data);
        }
        public static int pop(){
            return deque.removeLast();
        } 
        public static int peek(){
            return deque.getLast();

        }
    }
    static class queue{
        static Deque<Integer> deque = new ArrayDeque<>();
        static void add(int data){
           deque.addLast(data);
        }
        static int remove(){
            return deque.removeFirst();
        }
        static int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
    }
}

import java.util.*;
public class DequeJcf {
    public static void main(String argss[]){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        while(!deque.isEmpty()){
            System.out.println(deque.removeLast());
        }
    }
}

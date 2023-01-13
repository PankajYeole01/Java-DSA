import java.util.LinkedList;
public class jcF {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList ();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);



    }
}

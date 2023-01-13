import java.util.*;
public class  queueusingLinkedlist {
    static class node{
        int data;
        node next;
        node(int data){
           this.data = data;
           this.next = null;
        }

    }
    public static class queue{
        static node head = null;
        static node tail = null;
        public static boolean isEmpty(){
            return head == null && tail==null;
        }
        public static void add(int data){
            node newnode = new node(data);
            if(head == null){
                head = tail= newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        queue q = new queue();
        System.out.println(q.remove());
    }
}

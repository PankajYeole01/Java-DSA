import java.util.*;
public class stackusingLL {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next = null;
        }

    }

    public static class stack{
        public static node head =null;
        //is Empty wala checking
        public static boolean isEmpty(){
            return head==null;
        }
        //push operation
        public static void push(int data){
            node newnode = new node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        //pop
        public static int pop(){
            if(head==null){
                return Integer.MIN_VALUE;
            }
            int temp = head.data;
            head = head.next;
            return temp;

        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
         stack s = new stack();
         s.push(1);
         s.push(2);
         s.push(3);
         while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

         }

    }
}

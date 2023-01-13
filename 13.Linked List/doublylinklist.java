import java.util.*;
public class doublylinklist {
    public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data= data;
            this.next =null;
            this.prev = null;
        }

    }
    public static node head=null;
    public static node tail=null;
    public static int size;
    public static void addFirst(int data){
       node newnode = new node(data);
       size++;
       if(head ==null){
        head = tail = newnode;
        return;
       }
       newnode.next = head;
       head.prev= newnode;
       head=newnode;


    }
    public static void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void addLast(int data){
        node newnode= new node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail =newnode;

    }
    public static int removeFirst(){
        if(head == null){
            System.out.println("Removal is not possible");
            return Integer.MIN_VALUE;
        }
        if (head==tail){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val = head.data;
        head=head.next;
        head.prev=null;
        return val;

    }
    public static int removeLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }if(head == tail){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next=null;
        return val;
    }
    public static void reverse(){
        node prev = null;
        node curr = head;
        tail =head;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev= curr;
            curr=next;


        }
        head=prev;
    }
    public static void main(String args[]){
        addFirst(1);
        addFirst(2);
        print();
        addLast(3);
        addFirst(5);
        print();
        System.out.println(removeFirst());
        print();
        System.out.println(removeLast());
        print();
        reverse();
        print();
    }
}

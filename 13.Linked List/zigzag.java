import java.util.*;
public class zigzag {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;

        }

    }
    public static node head;
    public static void zigzag(){
        //find mid
        node slow = head;
        node fast = head.next;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        node mid = slow;
        //reverse a linked list after mid
        node prev = null;
        node curr = mid.next;
        mid.next=null;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
        }
        //zigzag merging of linked list
        node lh =head;
        node rh = prev;
        node nextl,nextr;
        while(lh != null && rh !=null){
            nextl = lh.next;
            lh.next = rh;
            nextr = rh.next;
            rh.next = nextl;
            lh = nextl;
            rh = nextr;
        }


    }
    public static void main(String args[]){
        head =new node(1);
        head.next = new node(3);
        node temp = head.next;
        temp.next = new node(4);
        temp.next.next = new node(5);
        print();
        zigzag();
        print();



    }
    public static void print(){
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();

    }
}

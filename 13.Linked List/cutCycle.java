import java.util.*;
public class cutCycle {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node head;
    
    public static void main(String args[]){
         head  = new node(1);
         node temp = new node(2);
         head.next = temp;
         temp.next = new node(3);
         temp.next.next = temp;
         System.out.println(iscycle());
         removecycle();
         System.out.println(iscycle());


    }
    public static boolean iscycle(){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removecycle(){
        //check whethe there is a cycle;
        node slow=head;
        node fast=head;
        boolean flag =false;
        while(fast != null && fast.next != null){
               slow = slow.next;
               fast = fast.next.next;
               if(slow ==fast){
                flag = true;
                break;
               }
        }
        if (flag==false){
            return;
        }
        slow =head;
        node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev=fast;
            fast = fast.next;
        }
        prev.next=null;
    }
}

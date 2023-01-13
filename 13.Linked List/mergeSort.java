import java.util.*;
public class mergeSort {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;

        }

    }
    public  static node mergesort(node head){
        if(head == null  || head.next == null){
            return head;
        }
        //find mid
        node mid = getmid();
        //left and right ms
        node righthead = mid.next;
        mid.next = null;
        node newleft = mergesort(head);
        node newright = mergesort(righthead);
        //merging left and right node
        return merge(newleft,newright);


    }
    public static node getmid(){
        node slow = head;
        node fast = head.next;
        while(fast != null && fast.next!= null){
            slow=slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public static node merge(node head1,node head2){
        node mergell = new node(-1);
        node temp = mergell;
        while(head1 != null && head2 !=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 !=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    } 
    
    public static node head;
    public static void main(String args[]){  
        head =new node(1);
        head.next = new node(100);
        node temp = head.next;
        temp.next = new node(41);
        temp.next.next = new node(5);
        print();
        head = mergesort(head);
        print();

    }
    public static void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

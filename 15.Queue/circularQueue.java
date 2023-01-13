import java.util.*;
//all operations are performed in O(1) time complexity

public class circularQueue {
    static class queue{
        static int arr[];
        static int front =-1;
        static int rear = -1;
        static int size;
        queue(int n){
            size =n;
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return rear == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if(front == rear){
                front = rear =-1;
            }else{
                front =(front +1)%size;
            }
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }


    }
    public static void main(String args[]){
        queue q = new queue(5);
        System.out.println(q.remove());


    }
}

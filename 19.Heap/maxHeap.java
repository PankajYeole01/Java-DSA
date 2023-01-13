import java.util.*;
public  class maxHeap {
   
    public static class heap{
        static ArrayList<Integer>arr = new ArrayList<>();
        public static void insert(int data){
             arr.add(data);
             int cld= arr.size()-1;
             int par = (cld-1)/2;
             while(par>-1 && arr.get(cld)>arr.get(par) ){
                int temp =arr.get(cld);
                arr.set(cld,arr.get(par));
                arr.set(par,temp);
                cld = par;
                par =(par-1)/2;
             }

        }
        public static boolean isEmpty(){
            return arr.size()==0;
        }
        public static int peek(){
            return arr.get(0);
        }
        public static void Heapify(int i){
             int max=i;
             int left = 2*i+1;
             int right = 2*i+2;
             if(left <arr.size() && arr.get(left)>arr.get(max)){
                 max = left;
             }
             if(right<arr.size() && arr.get(right)>arr.get(max)){
                max= right;
             }
             if(max!=i){
                int temp =arr.get(i);
                arr.set(i,arr.get(max));
                arr.set(max,temp);
                Heapify(max);
             }
        }
        public static int remove(){
            int data=arr.get(0);
            int temp =data;
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            Heapify(0);
            return data;
        }
    }
    public static void main(String args[]){
        heap h1 = new heap();
        h1.insert(3);
        h1.insert(8);
        h1.insert(5);
        h1.insert(6);
        while(!h1.isEmpty()){
            System.out.println(h1.remove());
        }
    }
}
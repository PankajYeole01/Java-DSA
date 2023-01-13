import java.util.*;
public class heapOperations {
    static class heap{
        static ArrayList<Integer> arr= new ArrayList<>();
    
        public static void insert(int data){
            arr.add(data);
            int x =arr.size()-1;
            int par = (x-1)/2;
            while(par>-1 && arr.get(par)>arr.get(x)){
                int temp = arr.get(par);
                arr.set(par,arr.get(x));
                arr.set(x,temp);
                x = par;
                par= (par -1)/2;
            }

        }
        public static int peek(){
            return arr.get(0);
        }
        public static void Heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int min = i;
            if(left<arr.size() && arr.get(left)<arr.get(min)){
                min = left;
            }
            if(right < arr.size()&& arr.get(right)<arr.get(min)){
                min = right;
            }
            if(min!=i){
                int temp = arr.get(min);
                arr.set(min,arr.get(i));
                arr.set(i,temp);
                Heapify(min);
            }
        }
        public static int remove(){
            int data = arr.get(0);
            int temp =data;
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            Heapify(0);
            return data;
        }
        public static boolean isEmpty(){
            return arr.size()==0;
        }
    }
   
    public static void main(String args[]){     
          heap h1 = new heap();
          h1.insert(1);
          h1.insert(3);
          h1.insert(2);
          h1.insert(6);
          while(h1.isEmpty()){
            System.out.println(h1.remove());
          }
          
    }
}

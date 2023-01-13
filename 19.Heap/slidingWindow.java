import java.util.*;
public class slidingWindow {
    public static class pair implements Comparable<pair>{
        int data;
        int idx;
        public pair (int data,int idx){
             this.data=data;
             this.idx = idx;
        }
        @Override
        public int compareTo(pair p){
            //descending order
            return p.data-this.data;
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;//window size
        PriorityQueue<pair>pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<k;i++){
           pq.add(new pair(arr[i],i));
        }
        int res[]=new int[arr.length-k+1];
        res[0]=pq.peek().data;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx <= i-k){
                pq.remove();
            }
            pq.add(new pair(arr[i],i));
            res[i-k+1]=pq.peek().data;
        }
        for(int i=0;i<=arr.length-k;i++){
            System.out.print(res[i]+" ");
        }
    }
}

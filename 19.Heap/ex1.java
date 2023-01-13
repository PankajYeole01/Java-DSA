import java.util.*;
public class Main{
    public static void main(String args[]){
        int stream[]={10,20,11,70,50,40,100,5};
        int []ans=getKthmaxInstant(stream,8,3);
        for(int x:ans){
            System.out.println(x);
        }
    }
    

    
    public static int[] getKthmaxInstant(int arr[],int n,int k){
        int idx=-1;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int []res=new int [n];
        for(int x:arr){
            if(pq.size()<k){
               pq.add(x);
            }
            else{
                pq.add(x);
                pq.poll();
            }
            if(pq.size()<k){
                res[++idx]=-1;

            }
            else{
                res[++idx]=pq.peek();
            }
        }
        return res;
 
    }

}
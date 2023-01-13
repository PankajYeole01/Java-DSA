import java.util.*;
public class nextGreater {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextarr[]=new int[arr.length];
        Stack <Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextarr[i]=-1;
            }
            else{
                nextarr[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(nextarr[i]+" ");
        }
        System.out.println();
    }

    
}

import java.util.*;
public class maxAraeHistogram {
    public static int maxArea(int height[]){
        int max =Integer.MIN_VALUE;
        Stack<Integer>s=new Stack<>();
        int nxtl[]=new int[height.length];
        int nxtr[]=new int [height.length];

        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtr[i]=height.length;
            }
            else{
                nxtr[i]=s.peek();
            }
            s.push(i);
            
        }
        //next smaller from left
        s = new Stack<>();
        for(int i=0;i<height.length;i++){
           while(!s.isEmpty() && height[s.peek()]>=height[i]){
               s.pop();
           }
           if(s.isEmpty()){
            nxtl[i]=-1;
           }
           else{
            nxtl[i]=s.peek();
           }
           s.push(i);
        }
        
        for(int i=0;i<height.length;i++){
             int curr_max = (nxtr[i]-nxtl[i]-1)*height[i];
             max = Math.max(curr_max,max);
                 
        }
        return max;


    }
    public static void main(String args[]){
        int height[]={2,1,5,6,2,3};
        System.out.println(maxArea(height)); 

    }
}

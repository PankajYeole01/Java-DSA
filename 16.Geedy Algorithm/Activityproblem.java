import java.util.*;
public class Activityproblem{
      public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int lastend = end[0];
        int maxact = 1;
        ArrayList<Integer> q = new ArrayList<>();
        q.add(0);
        for(int i=1;i< end.length;i++){
            if(start[i]>=lastend){
                maxact++;
                lastend = end[i];
                q.add(i);
            }
        }
        System.out.println("maximum amount of tasks are "+ maxact);
        for(int i=0;i<q.size();i++){
            System.out.print("A"+q.get(i)+" ");
        }
        
        
      }
}
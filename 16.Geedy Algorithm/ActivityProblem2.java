import java.util.*;
public class ActivityProblem2 {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int table[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            table[i][0]=i;
            table[i][1]=start[i];
            table[i][2]=end[i];
        }
        Arrays.sort(table,Comparator.comparingDouble(o->o[2]));
        int maxact = 1;
        int lastend = table[0][0];
        for(int i=1;i<start.length;i++){
            if(table[i][1]>=lastend){
                maxact++;
                lastend = table[i][2];

            }
        }
        System.out.println(maxact);
    }
}

import java.util.*;
public class MaxChain{
     public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainlength = 1;
        int chainend = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(chainend <= pairs[i][0]){
                chainend = pairs[i][1];
                chainlength++;
            }
        }
        System.out.println("Maximum chain length is "+ chainlength);

     }
}
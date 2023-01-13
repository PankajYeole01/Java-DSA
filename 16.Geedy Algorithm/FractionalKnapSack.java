import java.util.*;
public class FractionalKnapSack {
    public static void main(String args[]){
    int weight[]={10,20,30};
    int value[] = {60,80,120};
    int finalVal=0;
    int capacity = 50;
    double ratio[][] = new double[value.length][2];
    for(int i=0;i<weight.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=value[i]/weight[i];

    }
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
    for(int i = value.length-1;i>=0;i--){
        int idx= (int)ratio[i][0];
        if(capacity>=weight[idx]){
             finalVal += value[idx];
             capacity  -= weight[idx];
        }
        else{
            finalVal += capacity * ratio[i][1];
            break;
        }


    }
 

    System.out.println("maximum value obtained from knapsack is "+ finalVal );



    }

}

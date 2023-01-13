import java.util.*;
public class Mincoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
       
        int amount =590;
        int coincount =0;
        for(int i=0;i<coins.length;i++){
            
            if(amount >= coins[i]){
                while(amount>=coins[i]){
                    amount -= coins[i];
                    coincount++;
                }
            }
            if (amount == 0){
                break;
            }
        }
        System.out.println("Number of coins is "+ coincount);
    }
}

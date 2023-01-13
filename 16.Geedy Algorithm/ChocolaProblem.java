import java.util.*;
public class ChocolaProblem {
    public static void main(String args[]){
        Integer CostHor[]={4,1,2};
        Integer CostVer[]={2,1,3,1,4};
        Arrays.sort(CostHor,Collections.reverseOrder());
        Arrays.sort(CostVer,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<CostHor.length && v<CostVer.length){
            if(CostHor[h]<=CostVer[v]){
                cost+=CostVer[v]*hp;
                v++;
                vp++;

            }
            else{
                cost += CostHor[h]*vp;
                hp++;
                h++;
            }
        }
        while(h<CostHor.length){
            cost += CostHor[h]*vp;
            hp++;
            h++;

        }
        while(v<CostVer.length){
            cost += CostVer[v]*hp;
            v++;
            vp++;
        }
        System.out.println("Minimum Cost is "+cost);
    }
}

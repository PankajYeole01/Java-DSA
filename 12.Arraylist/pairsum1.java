import java.util.*;


public class pairsum1 {
    public static boolean findpair(ArrayList<Integer>list,int target){
        int lp =0,rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp ++;
            }
            else if(list.get(lp)+list.get(rp)>target){
                rp --;
            }
        }
        return false;
    }
    public  static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(34);
        list.add(56);
        System.out.println(findpair(list,44));

    }
}

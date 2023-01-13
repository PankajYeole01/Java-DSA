import java.util.*;

public class Findmax{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(89);
        list.add(100);
        list.add(125);
        list.add(200);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }
        System.out.println("maximum number is "+ max);
    }
}
    
    

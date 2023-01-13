import java.util.*;
public class Swapping {
    public static void swap (ArrayList<Integer>list,int i,int j){
        System.out.println(list);
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        System.out.println(list);
    }
    public  static void main(String args[]){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int idx1 = 2,idx2 = 4;
        swap (list,idx1,idx2);

    }
}
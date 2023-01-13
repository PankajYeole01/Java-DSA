import java.util.*;
public class Inbuildsorting {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(200);
        list.add(31);
        list.add(4);
        list.add(500);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
 }
}

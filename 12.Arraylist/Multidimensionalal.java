import java.util.*;
public class Multidimensionalal {
    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainlist  = new ArrayList<>();
        ArrayList <Integer> list=new ArrayList<>();
        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
        // mainlist.add(list);
        // mainlist.add(list1);
        // mainlist.add(list2);
        for(int i=1;i<5;i++){   
            list.add(i);
            list1.add(i*2);
            list2.add(i*3);
        }
        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);
        System.out.println(mainlist);

    }
}

import java.util.ArrayList;
public class operations{
    public static void main(String args[]){
         ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer>list3 = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);//O(1)- Time Complexity
         //get eleement
         int element =list.get(2);
         //System.out.println(element);
         //delete element //Time complexity O(n)
        //  System.out.println(list);
        //  list.remove(2  );
        //  System.out.println(list);
         //set element 
        //  System.out.println(list);
        //  list.set(2,10);
        //  System.out.println(list);
        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));
        //size
        System.out.println(list.size());


    }
}
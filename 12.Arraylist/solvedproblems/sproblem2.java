import java.util.*;


public class sproblem2 {
    public static ArrayList<Integer> findlonely(ArrayList<Integer> list){
       Collections.sort(list);
       int n=list.size()-1;
       ArrayList<Integer>nums = new ArrayList<>();
       for(int i=1;i<list.size()-1;i++){
           if(list.get(i-1)+1<list.get(i) && list.get(i)+1<list.get(i+1) ){
            nums.add(list.get(i));
           }
       }
       if(list.size() ==1){
        nums.add(list.get(0));
       }
       else {
        if(list.get(n-1)+1 < list.get(n)){
            nums.add(list.get(n));
        }
         if(list.get(0)+1<list.get(1)){
            nums.add(list.get(0));
         }
       }

       
       return nums;
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findlonely(list));
    }
       
}

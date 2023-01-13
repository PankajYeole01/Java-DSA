import java.util.*;
public class hashMap{
    public static void main(String args[]){
        HashMap<String,Integer>hm = new HashMap<>();
        //Insert element in to Hashmap
        //Insert ->Time Complexity - O(1)
        hm.put("Pankaj",1);
        hm.put("Omkar",2);
        hm.put("Jay",3);
        hm.put("Atharva",4);
        // System.out.println(hm);
        //get function ->time complexity-O(1)
        // System.out.println(hm.get("pankaj"));
        //contaiinsKey -> Time complexity-O(1) -> It returns true or false depending upon whether key is present or not in the given 
        // System.out.println(hm.containsKey("Pankaj"));
        //.remove( ) function - return value while returning
        System.out.println(hm.remove("Pankaj"));
       /*
          1) hm.size()- returns no of key value pair in a hashmap
          2)
        */
    }
}
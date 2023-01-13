import java.util.*;
public class printBinary1ton {
    public static void printbinary(int n){
        Queue <String> q = new ArrayDeque<>();
        q.add("1");
        while(n-- >0){
            String s1 = q.remove();
            System.out.println(s1);
            q.add(s1+"0");
            q.add(s1+"1");

        }
    }
     public static void main(String args[]){
       printbinary(5);

     }
    
}

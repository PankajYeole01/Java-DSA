import java.util.*;
public class Findsubset{
    public static void main(String args[]){
        String str = "abc";
        String ans="";
        int i=0;
        findsubstring(str,ans,i);
    }
    public static void findsubstring(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes
        findsubstring(str,ans+str.charAt(i),i+1);
        //no
        findsubstring(str,ans,i+1);

    } 
}
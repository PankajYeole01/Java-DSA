import java.util.*;
public class findpermutation{
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        find(str,ans);
    }
    public static void find(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return ;

        }
        for(int i =0 ;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstring = str.substring(0,i)+str.substring(i+1);
            find(Newstring,ans+curr);

        }
    }
}
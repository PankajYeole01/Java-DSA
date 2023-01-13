import java.util.*;
public class reverseString {
    public static void main(String args[]){
        Stack<Character>s=new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder str2 = new StringBuilder("");
        while(!s.isEmpty()){
            str2.append(s.pop());
        }
        System.out.println(str2);
    }
}

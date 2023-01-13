import java.util.*
public class PP1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        int countL = 0;
        int countR=0;
        int bal_Str =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='L'){
                countL ++;
            }else{
                countR ++;
            }
            if(countL == countR){
                bal_Str ++;
            }
        }
        System.out.println(bal_Str);
    }
}

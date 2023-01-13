import java.util.*;
public class StockSpan {
    public static void findstockspan(int stock[],int span[]){
        Stack<Integer>s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            while(!s.isEmpty() && stock[i]>=stock[s.peek()]){
                s.pop();
            
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-s.peek();
            }
            s.push(i);
        }
    }
   public static void main(String args[]){
     int stock[]={100,80,60,70,60,85,100};
     int span[]=new int[stock.length];
     findstockspan(stock,span);
     System.out.println("Span fo particular stocks is as follows:");
     for(int i=0;i<span.length;i++){
     System.out.println(span[i]);
    }

   }
}

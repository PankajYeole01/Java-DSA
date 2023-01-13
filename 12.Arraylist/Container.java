//For a given n lines on  x axis use 2 lines to form a container such that it holds a maximum water 
import java.util.*;
public class Container{
    public static int storewater (ArrayList<Integer>height){
        int lp = 0,rp = height.size()-1;
        int maximum =0;
        while(lp <rp){
            int length = Math.min(height.get(lp),height.get(rp));
            int width=rp -lp;
            int currwater=length*width;
            maximum = Math.max(maximum,currwater);
            if(lp<rp){
                lp++;

            }
            else{
                rp--;
            }

        }
        return maximum;

    }
    public static void main(String args[]){
        ArrayList<Integer>height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("maximum stored water is"+ storewater(height));
    }

}

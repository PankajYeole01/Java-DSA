import java.util.*;
public class findgridways{
    public static void main(String args[]){
         int n=3,m=3;
         System.out.println(findgrid(0,0,n,m));
    }
    public static int findgrid(int i,int j,int n,int m){
        //condition
        if(i==n-1 && j ==m-1){
            return 1;
        }
        else if(i>=n || j>=m){
            return 0;
        }
        return findgrid(i+1,j,n,m)+findgrid(i,j+1,n,m);
    }

}
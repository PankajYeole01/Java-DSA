import java.util.*;
public class Main{
    public static int getNoWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        return getNoWays(n-1)+getNoWays(n-2);
    }
    public static int getNoWaysByMemo(int n,int f[]){
        if(n==0 || n==1){
            f[n] = 1;
            return f[n];
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = getNoWaysByMemo(n-1,f)+getNoWaysByMemo(n-2,f);
        return f[n];
    }
    public static int getWaysByTabu(int n){
        int arr[] = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String args[]){
        int n=5;
        int f[] = new int[n+1];
        System.out.println(getWaysByTabu(5));
    }
}

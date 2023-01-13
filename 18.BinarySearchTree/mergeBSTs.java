import java.util.*;
public class mergeBSTs {
    static class node{
        int data;
        node leftchild;
        node rightchild;
        node(int data){
            this.data= data;
            this.leftchild =this.rightchild = null;
        }

    }
    public static void getinorder(node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getinorder(root.leftchild,arr);
        arr.add(root.data);
        getinorder(root.rightchild,arr);

    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftchild);
        preorder(root.rightchild);
    }
    public static node getBST(ArrayList<Integer>arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        // if((start+end) %2 ==0){
        //      mid=(start+end)/2;
        // }
        // else{
        //     mid = (start+end)/2+1;
        
        node newnode = new node(arr.get(mid));
        newnode.leftchild = getBST(arr,start,mid-1);
        newnode.rightchild = getBST(arr,mid+1,end);
        return newnode;
    }
    public static node mergeBST(node root1,node root2){
        ArrayList<Integer>arr1= new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        getinorder(root1,arr1);
        getinorder(root2,arr2);
        ArrayList<Integer>arr = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                arr.add(arr1.get(i));
                i++;
            }
            else{
                arr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            arr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            arr.add(arr2.get(j));
            j++;
        }
        node root = getBST(arr,0,arr.size()-1);
        return root;

    }
    public static void main(String args[]){
        node root1 = new node(2);
        root1.leftchild= new node(1);
        root1.rightchild = new node(4);
        /*
            2
           / \
          1   4
         */
        node root2 = new node(9);
        root2.leftchild= new node(3);
        root2.rightchild = new node(12);
        /*
             9
            / \
           3   12
         */
        node root = mergeBST(root1,root2);
        preorder(root);

    }
}

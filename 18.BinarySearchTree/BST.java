import java.util.*;
public class BST{
    static class node{
        int data;
        node leftchild;
        node rightchild;
        node(int data){
            this.data= data;
        }
    }
    public static node insert(node root,int val){
        if(root==null){
            root = new node(val);
            return root;
        }
        if(root.data < val){
            root.rightchild = insert(root.rightchild,val);
            return root;
        }
        else{
            root.leftchild=insert(root.leftchild,val);
            return root;
        }
        
    }
    public static void inorder(node root){
        if (root ==null){
            return;
        }
        inorder(root.leftchild);
        System.out.print(root.data+" ");
        inorder(root.rightchild);
    }
    public static boolean search(node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        boolean flag = (root.data >key) ?   search(root.leftchild,key): search(root.rightchild,key);
        return flag;
        
        
    }
    public static node delete(node root,int val){
       
        if(root.data < val){
            root.rightchild = delete(root.rightchild,val);
       }
       else if(root.data>val){
            root.leftchild = delete(root.leftchild,val);
       }
       else{
            if(root.leftchild == null && root.rightchild == null){
                return null;
            }
            if(root.leftchild == null){
                return root.rightchild;
            }
            if(root.rightchild == null){
                return root.leftchild;
            }
            node IS = findInorderSuccesor(root.rightchild);
            root.data=IS.data;
            root.rightchild = delete(root.rightchild,IS.data);
       }
       return root;
      
    }
    public static node findInorderSuccesor(node root){
        while(root.leftchild != null){
            root= root.leftchild;
        }
        return root;
    }
    public static void printInRange(node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
         
            printInRange(root.leftchild,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.rightchild,k1,k2);
            return;
        }
        if(root.data<k1){
            printInRange(root.rightchild,k1,k2);
            return;
        }
        if(root.data>k2){
            printInRange(root.leftchild,k1,k2);
            return;
        }
    }
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printRoot(node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        printRoot(root.leftchild,path);
        if(root.leftchild == null && root.rightchild==null){
            printpath(path);

        }
        
        printRoot(root.rightchild,path);
        path.remove(path.size()-1);
    }
    public static boolean isValidBST(node root,node min,node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max != null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.leftchild,min,root) && isValidBST(root.rightchild,root,max);

    }
    public static node mirrorBST(node root){
        if(root==null){
            return null;
        }
        node right = mirrorBST(root.rightchild);
        node left = mirrorBST(root.leftchild);
        root.leftchild=right;
        root.rightchild = left  ;
        return root;
    }
    public static node createBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        node root = new node(arr[mid]);
        root.leftchild = createBST(arr,start,mid-1);
        root.rightchild = createBST(arr,mid+1,end);
        return root;
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftchild);
        preorder(root.rightchild);
    }
    public static void getInorder(ArrayList<Integer>inorderList,node root){
        if(root==null){
            return;
        }
        getInorder(inorderList,root.leftchild);
        inorderList.add(root.data);
        getInorder(inorderList,root.rightchild);

    }
    public static node createBST(ArrayList<Integer>inorderList,int start,int end){
        if(start>end){
            return null;
        }
        int mid= (start+end)/2;
        node root = new node(inorderList.get(mid));
        root.leftchild = createBST(inorderList,start,mid-1);
        root.rightchild=createBST(inorderList,mid+1,end);
        return root;
    }
    public static node balanceBST(node root){
        ArrayList<Integer> inorderList= new ArrayList<>();
        getInorder(inorderList,root);
        return createBST(inorderList,0,inorderList.size()-1);

    }
    public static List<List<Integer>> levelOrder(node root) {
        List<Integer>inner = new ArrayList<>();
        List<List<Integer>>outer = new ArrayList<>();
        Queue<node>q =new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node curr = q.remove();
            if(curr != null){
               inner.add(root.data);
               if(root.leftchild != null){
                   q.add(root.leftchild);
               }
               if(root.rightchild != null){
                   q.add(root.rightchild);
               }
            }
            else{
                outer.add(inner);
                inner.clear();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return outer;
    }
    public static void main(String args[]){
        int values[]={10,8,6,4,9,7,1,2,3,5};
        node root = null;
        for(int i=0;i<values.length;i++){
            root= insert(root,values[i]);
        }
        List<List<Integer>>lst = new ArrayList<>();
        lst = levelOrder(root);
        for(int i=0 ;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
        // inorder(root);
        // System.out.print("11  is present in BST "+ search(root,11));
        // delete(root,8);
        // inorder(root);
        // printInRange(root,1,6);
        // printRoot(root,new ArrayList<>());
        // if(isValidBST(root,null,null)){
        //     System.out.print("valid BST");
        // }
        // else{
        //     System.out.print("Not valid");
        // }
        // mirrorBST(root);
        // inorder(root);
        int []arr={3,5,6,8,10,11,12};
        node root1 = createBST(arr,0,arr.length-1);
        preorder(root1);

    }
}

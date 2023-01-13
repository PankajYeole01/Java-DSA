import java.util.*;

public class binaryTree{
    static class node{
        int data;
        node leftchild;
        node rightchild;
        node(int data){
            this.data = data;
            this.leftchild=null;
            this.rightchild = null;
        }

    }
    static int idx = -1;
    static node makeBinary(int []nodes){
            idx ++;
            if(nodes[idx]==-1){
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.leftchild=makeBinary(nodes);
            newnode.rightchild = makeBinary(nodes);
            return newnode;

    }
    // preorder traversal - VLR
    public static void preorder(node root){
        if(root == null){
            System.out.print(-1+" " );
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftchild);
        preorder(root.rightchild);

   
    }
      //inorder traversal
    public static void inorder(node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.leftchild);
        System.out.print(root.data+" ");
        inorder(root.rightchild);


    }
    public static void postorder(node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        postorder(root.leftchild);
        postorder(root.rightchild);
        System.out.print(root.data+" ");
    }
    //leetcode problem
    static boolean flag =true;
    public boolean isUnivalTree(node root) {
        if(root==null){
            return true;
        }
        int key = root.data;
        preorder(root,key);
        return flag;
    }
    public static void preorder(node root,int key){
        if(flag==false){
            return;
        }
        if(root == null){
            return;
        }
        if(root.data != key){
            flag = false;
            return;
        }
        
        preorder(root.leftchild,key);
        preorder(root.rightchild,key);
    }
    //level order traversal 
    public static void levelOrder(node root){
        Queue<node>q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    System.out.println();
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.leftchild !=null){
                    q.add(currNode.leftchild);
                }
                if(currNode.rightchild != null){
                    q.add(currNode.rightchild);
                }
            }
        }
    }
    // calculating height of tree
    public static int height(node root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.leftchild);
        int rheight = height(root.rightchild);
        return Math.max(lheight , rheight) + 1;
    }
    //count no of nodes in tree
    public static int count(node root){
        if (root == null){
            return 0;
        }
        int lcount = count(root.leftchild);
        int rcount = count(root.rightchild);
        return (lcount+rcount+1);
    }
    public static int sumOfnodes(node root){
        if (root == null){
            return 0;
        }
        int lsum = sumOfnodes(root.leftchild);
        int rsum = sumOfnodes(root.rightchild);
        return lsum+rsum+root.data;

    }
    //calculating diameter of tree - maximum no of distance between between two leaves


    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int lheight = height(root.leftchild);
        int rheight = height(root.rightchild);
        int ldiam  = diameter(root.leftchild);
        int rdiam = diameter(root.rightchild);
        int self = lheight+ rheight+ 1;
        return Math.max(self,Math.max(ldiam,rdiam));


    }
    static class info{
        int diam;
        int ht;
        info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    // diameter2 function to calculate maximum distance between two leaves 
    public static  info diameter2(node root){
        if(root == null){
            return new info(0,0);
        }
       info leftinfo =diameter2(root.leftchild);
       info rightinfo = diameter2(root.rightchild);
       int diam = Math.max(leftinfo.diam,Math.max(rightinfo.diam,leftinfo.ht+rightinfo.ht+1));
       int ht = Math.max(leftinfo.ht,rightinfo.ht)+1;
       return new info(diam,ht);
    } 
    public static boolean isSubtree(node root,node subroot){
        if(root == null){
            return false;
        }
        if(isidentical(root,subroot)){
            return true;
        }
        return isSubtree(root.leftchild,subroot) || isSubtree(root.rightchild,subroot);
    }
    public static boolean isidentical(node root,node subroot){
        if(root == null && subroot == null){
            return true;
        }else if(root == null || subroot == null || root.data!=subroot.data){
            return false;
        }
        if(!isidentical(root.leftchild,subroot.leftchild)){
            return false;
        }
        if(!isidentical(root.rightchild,subroot.rightchild)){
            return false;
        }
        return true;
    }
    static class info2{
        node n;
        int hd;
        info2(node n,int hd){
            this.n = n;
            this.hd=hd;
        }


    }
    public static void topView(node root){
        Queue<info2> q = new LinkedList<>();
        HashMap<Integer,node> map = new HashMap<>();
        q.add(new info2(root,0));
        int min =0 ,max =0;

        while(!q.isEmpty()){
            info2 curr = q.remove();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.n);
            }
            if(curr.n.leftchild != null){
                q.add(new info2(curr.n.leftchild,curr.hd-1));
                min = Math.min(curr.hd-1,min);
            }
            if(curr.n.rightchild != null){
                q.add(new info2(curr.n.rightchild,curr.hd+1));
                max = Math.max(max,curr.hd+1);
            }
        }
        for(int i= min ;i<=max;i++){
            System.out.print(map.get(i).data+" ");

        }
        System.out.println();
       
    }
    // writing kth level of tree 
    public static void kthlevel(node root, int level,int k){
        if(root == null){
            return ;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return ;
        }
        kthlevel(root.leftchild,level+1,k);
        kthlevel(root.rightchild,level+1,k);
    }
    //Lowest common ancestor aproach 1
    public static node getlca(node root,int n1 , int n2){
        ArrayList<node> path1 = new ArrayList<>();
        ArrayList<node>path2 = new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);

    }
    public static boolean getpath(node root,int n , ArrayList <node>path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getpath(root.leftchild,n,path);
        boolean foundRight = getpath(root.rightchild,n,path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
        

    }
    public static node getlca2 (node root,int n1,int n2){
        if(root==null || root.data == n1 || root.data == n2){
            return root;
        }
        node leftLca = getlca2(root.leftchild, n1,  n2);
        node rightLca = getlca2(root.rightchild,n1,n2);
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;

    }
    public static int  getDistance(node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = getDistance(root.leftchild,n);
        int right = getDistance(root.rightchild,n);
        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right+1;
        }
        else{
            return left+1;
        }
    }
    public static int minDistance(node root,int n1 ,int n2){
        node lca = getlca2(root,n1,n2);
        int leftDistance = getDistance(lca,n1);
        int rightDistance = getDistance(lca,n2);
        return leftDistance + rightDistance;
    }
    //finding Kth ancestor
    public static int Kthancestor(node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance = Kthancestor(root.leftchild,n,k);
        int rightDistance = Kthancestor(root.rightchild,n,k);
        if(leftDistance == -1 && rightDistance==-1){
            return -1;
        }
        int max = Math.max(leftDistance,rightDistance);
        if(max+1==k){
            System.out.print("K th ancestor is "+root.data);
            
        }
        return max+1;
        
    }
    public static int sumTree(node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumTree(root.leftchild);
        int rightSum = sumTree(root.rightchild);
        int curr = root.data;
        root.data = leftSum + rightSum;
        return root.data+curr;
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,7,-1,-1,6,-1,-1};
        node root = makeBinary(nodes);
        // System.out.println(root.data);    
        // levelOrder(root);
        /*
                     1
                    / \
                   2   3
                  / \   \
                 4   5   6
         */
        // System.out.print("Diameter  of tree  is "+ diameter2(root).diam);
        // node subroot = new node(2);
        // subroot.leftchild = new node(4);
        // subroot.rightchild= new node(5);
        /*
              2
             / \
            4   5
        */
        // System.out.print(isSubtree(root,subroot));
        // sumTree(root);
        // System.out.print(root.data);

    }
}
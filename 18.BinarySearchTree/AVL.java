public class AVL {
    static class node{
        int data,height;
        node left,right;
        node(int data){
            this.data = data;
            height =1;
        }
    }
    public static node root;
    public static int getHeight(node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    public static int getbf (node root){
        if(root==null){
            return 0;
        }
        return getHeight(root.left)-getHeight(root.right);
    }
    public static node rightRotate(node x){
        node y=x.left;
        node T2 = y.right;
        y.right=x;
        x.left =T2;
        x.height = 1+Math.max(getHeight(x.left),getHeight(x.right));
        y.height = 1+Math.max(getHeight(y.left),getHeight(y.right));
        return y;
    }
    public static node leftRotate(node x){
        node y = x.right;
        node T2 = y.left;
        y.left = x;
        x.right =T2;
        x.height =1+Math.max(getHeight(x.left),getHeight(x.right));
        y.height = 1+Math.max(getHeight(y.left),getHeight(y.right));
        return y;
    }
    public static node insert(node root,int key){
        if(root==null){
            return new node(key);
        }
        else if(root.data>key){
            root.left = insert(root.left,key);
        }else if(root.data<key){
            root.right=insert(root.right,key);
        }
        else{
            return root;
        }
        root.height = 1+Math.max(getHeight(root.left),getHeight(root.right));
        int bf = getbf(root);
        if(bf>1 && key <root.left.data){
            return rightRotate(root);
        }
        if(bf>1 && key>root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if(bf<-1 && key > root.right.data){
            return leftRotate(root);
        }
        if(bf<-1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static node getMin(node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static node deleteNode(node root,int key){
        if(root==null){
            return root;
        }
        else if(root.data>key){
            root.left = deleteNode(root.left,key);
        }
        else if(root.data<key){
            root.right= deleteNode(root.right,key);
        }
        else{
            if(root.left == null || root.right==null){
                node temp=null;
                if(root.left ==null){
                    temp = root.right;
                }
                else{
                    temp = root.left;
                }
                //no child node
                if(temp == null){
                    root= null;
                  
                }
                else{
                    root = temp;
                }

            }
            else{
                //find inorder successor of tree traversal
                node nextMin = getMin(root.right);
                root.data = nextMin.data;
                root.right = deleteNode(root.right,nextMin.data);
            }

        }
        if(root==null){
            return root;
        }

        root.height = 1+Math.max(getHeight(root.left),getHeight(root.right));
        int bf = getbf(root);
        if(bf>1 && getbf(root.left)>=0){
            return rightRotate(root);
        }
        else if(bf >1 && getbf(root.left)<0){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        else if(bf<-1 && getbf(root.right)<=0){
            return leftRotate(root);
        }
        else if(bf<-1 && getbf(root.right)>0){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    
    }
    public static void main(String args[]){
        root=insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        
        root = insert(root,25);
        System.out.println(root.data);
        deleteNode(root, 40);
        preorder(root);
    }
}

public class findLargestBST {
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;

        }
    }
    public static class info{
        boolean isBST;
        int size;
        int min;
        int max;
        info(boolean isBST,int size,int min,int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST1=0;
    public static info maxBST(node root){
        if(root == null){
            return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        info leftinfo = maxBST(root.left);
        info rightinfo = maxBST(root.right);
        int size = leftinfo.size+rightinfo.size+1;
        int min = Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
        int max = Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
        if(root.data<=leftinfo.max || root.data>=rightinfo.min){
             return new info(false,size,min ,max);
        }
        if(leftinfo.isBST && rightinfo.isBST){
            maxBST1 = Math.max(maxBST1,size);
            return new info(true,size,min,max);
        }
        return new info(false,size,min,max);
    }
    public static void main(String args[]){
        node root= new node(50);
        root.left = new node(30);
        root.left.left = new node(5);
        root.left.right = new node(20);
        root.right = new node(60);
        root.right.left = new node(45);
        root.right.right = new node(70);
        root.right.right.left = new node(65);
        root.right.right.right = new node(80);
        maxBST(root);
        System.out.print("Max Valid BST is "+ maxBST1);
    }
}

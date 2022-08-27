package BinarySearchTree;

public class BST {
    private BinaryTreeNode<Integer> root;
    public void insert(int data) {
        //Implement the insert() function
        root=  inserthelp(root,data);
    }
    private static BinaryTreeNode<Integer> inserthelp(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            BinaryTreeNode<Integer> newnode=new BinaryTreeNode<>(data);
            return newnode;
        }
        else if(data<root.data){
            root.left= inserthelp(root.left,data);
        }
        else{
            root.right=  inserthelp(root.right,data);}
        return root;
    }
    public void remove(int data) {
        root= removehelp(root,data);
    }
    private static BinaryTreeNode<Integer> removehelp(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            return null;
        }
        if(data>root.data){
            root.right =removehelp(root.right,data);
            return root;
        }
        else if(data<root.data){
            root.left=removehelp(root.left,data);
            return root;
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }
            else{
                int min=minValue(root.right);
                root.data=min;
                root.right=removehelp(root.right,min);
                return root;
            }
        }
    }
    public static int minValue(BinaryTreeNode<Integer> root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public void printTree() {
        //Implement the printTree() function
        printtreehelp(root);
    }
    private static void printtreehelp(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L:"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R:"+root.right.data);
        }
        System.out.println();
        printtreehelp(root.left);
        printtreehelp(root.right);

    }
    public boolean search(int data){
        return searchhelp(root,data);
    }
    private static boolean searchhelp( BinaryTreeNode<Integer> root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        if(data<root.data){
            return searchhelp(root.left,data);
        }
        return searchhelp(root.right,data);
    }

    public static void main(String[] args) {
        BST b=new BST();
      b.insert(5);
       b.insert(2);
       b.insert(7);
       b.insert(1);
       b.insert(3);
        //b.insert(6);
       b.insert(8);
       b.printTree();

        System.out.println(b.search(5));
        b.remove(5);
        System.out.println(b.search(5));
    }
}




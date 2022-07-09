package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse{
    public static void printLevelWise(BTNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BTNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BTNode<Integer> front=q.poll();
            if(front.Lc==null && front.Rc==null)
            System.out.println(front.data+":"+"L"+":"+-1+","+"R"+":"+-1);
            else if(front.Lc==null && front.Rc!=null){
                System.out.println(front.data+":"+"L"+":"+-1+","+"R"+":"+front.Rc.data);
            }
            else if(front.Lc!=null && front.Rc==null){
                System.out.println(front.data+":"+"L"+":"+ front.Lc.data+","+"R"+":"+-1);
            }
            else{
                System.out.println(front.data+":"+"L"+":"+front.Lc.data+","+"R"+":"+front.Rc.data);
            }
            if(front.Lc!=null){
                q.add(front.Lc);
              //  System.out.print(front.Lc.data);
            }
            if(front.Rc!=null){
                q.add(front.Rc);
              //  System.out.print(front.Rc.data);
            }
        }
    }
    public static IsBalanceReturn IsbalanceBetter(BTNode<Integer> root){
        if(root==null){
            IsBalanceReturn ans=new IsBalanceReturn();
            ans.height=0;
            ans.isbalance=true;
            return ans;
        }
        IsBalanceReturn left=IsbalanceBetter(root.Lc);
        IsBalanceReturn right=IsbalanceBetter(root.Rc);
        boolean bal=true;
        int height=1+Math.max(left.height, right.height);
        if(Math.abs(left.height- right.height)>1){
            bal=false;
        }
        if(!left.isbalance || !right.isbalance){
            bal=false;
        }
        IsBalanceReturn ans=new IsBalanceReturn();
        ans.isbalance=bal;
        ans.height=height;
        return ans;
    }
    public static boolean IsBalance(BTNode<Integer> root){
        if(root==null){
            return true;
        }

        boolean Ltree=IsBalance(root.Lc);
        boolean Rtree=IsBalance(root.Rc);
        if(Math.abs(height(root.Lc)-height(root.Rc))>1){
            return false;
        }
        return Ltree && Rtree;
    }
    public static int height(BTNode<Integer> root){
        if(root==null){
            return -1;
        }
        int lefttree=height(root.Lc);
        int righttree=height(root.Rc);
        if(lefttree>righttree){
            return lefttree+1;
        }
        return righttree+1;
    }
    public static BTNode<Integer> removeLeafNodes(BTNode<Integer> root){
        if(root==null || (root.Lc==null && root.Rc==null)){
            return null;
        }
        BTNode<Integer> left=removeLeafNodes(root.Lc);
        BTNode<Integer> right=removeLeafNodes(root.Rc);
        root.Lc=left;
        root.Rc=right;
        return root;
    }
    public static void printNodesAtDepthK(BTNode<Integer> root,int k){
        if(root==null){
            return ;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        printNodesAtDepthK(root.Lc,k-1);
        printNodesAtDepthK(root.Rc,k-1);
        System.out.println(root.data);
    }
    public static  int noOfLeafNodes(BTNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.Lc==null && root.Rc==null){
            return 1;
        }
        int LTree=noOfLeafNodes(root.Lc);
        int RTree=noOfLeafNodes(root.Rc);
       return LTree+RTree;
    }
    public static int Largestdatainthetree(BTNode<Integer> root){
        if(root==null){
            return -1;
        }
        int leftTreelargest=Largestdatainthetree(root.Lc);
        int RightTreeLagrest=Largestdatainthetree(root.Rc);
        if(leftTreelargest>RightTreeLagrest){
            if(leftTreelargest>root.data){
                return leftTreelargest;
            }
            return root.data;
        }
        else{
            if(RightTreeLagrest>root.data){
                return RightTreeLagrest;
            }
        }
        return root.data;
    }
    public static void LevelWiseTraversal(BTNode<Integer> root){
        System.out.println(root.data);

    }
    public static int TotalNoOfNodes(BTNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lefttreenodes=TotalNoOfNodes(root.Lc);
        int Righttreenodes=TotalNoOfNodes(root.Rc);
        return 1+lefttreenodes+Righttreenodes;
    }
    public static BTNode<Integer> TaketreeUserInput(){
        //System.out.println("enter the root data");
        Scanner s=new Scanner(System.in);
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BTNode<Integer> root=new BTNode<>(rootdata);
        System.out.println("enter "+rootdata+" left child");
        BTNode<Integer> rootleft = TaketreeUserInput();
        System.out.println("enter "+rootdata+" right child");
        BTNode<Integer> rootright=TaketreeUserInput();
        root.Lc=rootleft;
        root.Rc=rootright;
        return root;
    }
    public static void printTreeDetailed(BTNode<Integer> root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+":");
        if(root.Lc!=null )
        System.out.print("Left "+root.Lc.data+" ");
        if(root.Rc!=null)
        System.out.print("Right "+root.Rc.data);
        System.out.println();
        printTreeDetailed(root.Lc);
        printTreeDetailed(root.Rc);
    }
    public static void printtree(BTNode root){
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        printtree(root.Lc);
        printtree(root.Rc);
    }
    public static BTNode<Integer> levelWiseinput(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter root data");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        BTNode<Integer> root=new BTNode<>(rootdata);
        Queue<BTNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BTNode<Integer> front=q.poll();
            System.out.println("enter left child of "+front.data);
            int l=s.nextInt();
            if(l!=-1){
                BTNode<Integer> leftchild=new BTNode<>(l);
                front.Lc=leftchild;
                q.add(leftchild);
            }
            System.out.println("enter right child "+front.data);
            int r=s.nextInt();
            if(r!=-1){
                BTNode<Integer> rightchild=new BTNode<>(r);
                front.Rc=rightchild;
                q.add(rightchild);
            }
        }
        return root;
    }
    public static void main(String[] args) {
      /*  BTNode<Integer> root=new BTNode<>(1);
        root.Lc=new BTNode<>(2);
        root.Rc=new BTNode<>(3);
        root.Lc.Rc=new BTNode<>(4);
        root.Rc.Lc=new BTNode<>(5);
        printtree(root);*/
      /*  BTNode<Integer> root=TaketreeUserInput();
        printTreeDetailed(root);
        System.out.println("total no of nodes is :");
        System.out.println(TotalNoOfNodes(root));
        System.out.println("largest data in the tree is :-");
        System.out.println(Largestdatainthetree(root));
        System.out.println("no of leaf nodes are:--");
        System.out.println(noOfLeafNodes(root));
        System.out.println("nodes at depth k");
        printNodesAtDepthK(root,2);
      //  System.out.println("Tree after removing leaf nodes");
       // BTNode<Integer> rootAfterRemovingLeaf=removeLeafNodes(root);
     //   printTreeDetailed(rootAfterRemovingLeaf);
        System.out.println("balancing of the tree");
        System.out.println(IsBalance(root));
        System.out.println("better code for balancing of the binary tree");
        IsBalanceReturn ans=IsbalanceBetter(root);
        System.out.println(ans.isbalance);
        System.out.println("height of binary tree");
        System.out.println(ans.height);*/
        BTNode<Integer> root=levelWiseinput();
        printLevelWise(root);
    }
}

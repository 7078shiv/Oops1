package GenericTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class GenericTreeTest {
    public static void printTreeLevelwise(GenericTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<GenericTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            GenericTreeNode<Integer> front=q.poll();
            if(front==null && q.size()!=0){
                q.add(null);
                System.out.println();
            }
            if(front!=null){
            System.out.print(front.data+" ");
            for(int i=0;i<front.children.size();i++){
                q.add(front.children.get(i));
            }
        }
        }
    }
    public static GenericTreeNode<Integer> takeInput(){
        Scanner s=new Scanner(System.in);
        Queue<GenericTreeNode<Integer>> q=new LinkedList<>();
        System.out.println("enter root data");
        int rootdata=s.nextInt();
        if(rootdata==-1){
            return null;
        }
        GenericTreeNode<Integer> root=new GenericTreeNode<>(rootdata);
        q.add(root);
        while(!q.isEmpty()){
            GenericTreeNode<Integer> front=q.poll();
            System.out.println("enter no of child of "+ front.data);
            int childno=s.nextInt();
            for(int i=0;i<childno;i++){
                System.out.println("enter the " +i+" child data for: "+front.data);
                int childata=s.nextInt();
                GenericTreeNode<Integer> childnode=new GenericTreeNode<>(childata);
                front.children.add(childnode);
                q.add(childnode);
            }
        }
        return root;
    }
    public static int NoOfNode(GenericTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int ans=1;
        for(int i=0;i<root.children.size();i++){
            GenericTreeNode<Integer> child=root.children.get(i);
            int sa=NoOfNode(child);
            ans+=sa;
        }
        return ans;
    }
    public static  void print(GenericTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        for(int i=0;i<root.children.size();i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            GenericTreeNode<Integer> child=root.children.get(i);
            print(child);
        }
    }
    public static void main(String[] args) {
        GenericTreeNode<Integer> root=new GenericTreeNode<>(4);
        GenericTreeNode<Integer>  n1=new GenericTreeNode<>(2);
        GenericTreeNode<Integer>  n2=new GenericTreeNode<>(3);
        GenericTreeNode<Integer>  n3=new GenericTreeNode<>(1);
        GenericTreeNode<Integer>  n4=new GenericTreeNode<>(5);
        GenericTreeNode<Integer>  n5=new GenericTreeNode<>(6);
        root.children.add(n1);
        root.children.add(n2);
        root.children.add(n3);
        n2.children.add(n4);
        n2.children.add(n5);
        //GenericTreeNode<Integer> root=takeInput();
       // print(root);
       // System.out.println(NoOfNode(root));
        printTreeLevelwise(root);
    }
}

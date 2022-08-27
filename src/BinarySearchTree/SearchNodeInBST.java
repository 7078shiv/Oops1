package BinarySearchTree;

import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;
    public Node(T data){
        this.data=data;
    }
}
public class SearchNodeInBST {
    static Node<Integer> root;

    public static void insert(int data){
        root=inserthelp(data);
    }
    public static Node inserthelp(int data){
        if(data==-1){
            return null;
        }
        Node<Integer> root=new Node<>(data);
        if(data<=root.data){
            root.left=inserthelp(data);
        }
        else{
            root.right=inserthelp(data);
        }
        return root;
    }
    public static boolean search(Node<Integer> root,int item){
        if(root==null){
            return false;
        }
        if(root.data==item){
            return true;
        }
        if(item<root.data){
            boolean ls=search(root.left,item);
            if(ls==true){
                return true;
            }
        }
        boolean rs=search(root.right,item);
        return rs;
    }
    private static void printtreehelp(Node<Integer> root){
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

    public static Node<Integer> TakeInput(){
        Scanner s=new Scanner(System.in);
       // System.out.println("enter root data");
        int rd=s.nextInt();
        if(rd==-1){
            return null;
        }
        Node<Integer> root=new Node<>(rd);
        System.out.println("enter "+rd+" leftchild");
        Node<Integer> Rl=TakeInput();
        System.out.println("enter "+rd+" rightchild");
        Node<Integer> Rr=TakeInput();
        root.left=Rl;
        root.right=Rr;
        return root;
    }
    public static void main(String[] args) {
        //Node<Integer> root=TakeInput();
        //System.out.println(search(root,9));
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while (data!=-1){
            insert(data);
        }
        printtreehelp(root);
    }
}

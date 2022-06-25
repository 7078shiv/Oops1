package LinkedList;
import java.util.*;
/*public class Solution {

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        //Your code goes here
        if(k==0 || k==1){
            return head;
        }
        if(head==null){
            return head;
        }
        // int c=k;
        Node<Integer> h1=head;
        Node<Integer> h2=null;
        Node<Integer> t1=head;
        for(int i=0;i<k-1;i++){
            t1=t1.next;
        }
        h2=t1.next;
        t1.next=null;
        Node<Integer> Rhead = reverse(h1);
        Node<Integer> KRhead = kReverse(h2,k);
        head.next=KRhead;
        return Rhead;
    }
    public static Node<Integer> reverse(Node<Integer> h1){
        if(h1==null){
            return h1;
        }
        Node<Integer> tail=h1.next;
        Node<Integer> sh=reverse(h1.next);
        tail.next=h1;
        h1.next=null;
        return sh;
    }
}


 if(h1==null){
         return h1;
         }
         LinkedListNode<Integer> tail=h1.next;
        LinkedListNode<Integer> sh=reverse(h1.next);
        tail.next=h1;
        h1.next=null;
        return sh;

public class Solution {
    public static Node<Integer> createlinklist(){
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(4);

        Node<Integer> n5=new Node<>(5);
        Node<Integer> n6=new Node<>(6);
        Node<Integer> n7=new Node<>(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        return n1;
    }
    public static int length(Node<Integer> head){
        int ll=0;
        while(head!=null){
            ll++;
            head=head.next;
        }
        return ll;
    }
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        int n=length(head);
        //Your code goes here
        for(int i=0;i<n-1;i++){
            Node<Integer> prev=null;
            Node<Integer> current=head;
            for(int j=0;j<(n-i-1);j++){
                if(current.data <= current.next.data){
                    prev=current;
                    current=current.next;
                }
                else
                {
                    if(prev==null){
                        Node<Integer> Next=current.next;
                        head=head.next;
                        current.next=Next.next;
                        Next.next=current;
                        prev=Next;
                    }
                    else{
                        Node<Integer> Next=current.next;
                        prev.next=Next;
                        current.next=Next.next;
                        Next.next=current;
                        prev=Next;
                    }
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=createlinklist();
        Node<Integer> sortedhead=bubbleSort(head);
        print(sortedhead);
    }
    public static void print(Node<Integer> head){
        if(head==null){
            return ;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
}*/
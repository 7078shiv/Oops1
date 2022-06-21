package LinkedList;
public class InsertRecursively {
    public static Node<Integer> reverse(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> h=head.next;
        Node<Integer> sh=reverse(head.next);

        h.next=head;
        head.next=null;
        return sh;
    }
    public static Node<Integer> insertRN(Node<Integer> head,int pos,int element){
        int ll=0;
        for(Node<Integer> temp=head;temp!=null;temp=temp.next){
            ll++;
        }
        if(pos>=ll){
            return head;
        }
        if(pos==0) {
            Node<Integer> newhead=new Node<>(element);
            newhead.next=head;
            return newhead;
        }

        Node<Integer> nhead=insertRN(head.next,pos-1,element);
        head.next=nhead;
        return head;
    }
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
    public static void print(Node<Integer> head){
        if(head==null){
            return ;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static void main(String[] args) {
        Node<Integer> head=createlinklist();
       // Node<Integer> headafterinsertion=insertRN(head,5,55);
        print(head);
        Node<Integer>newhead=reverse(head);
        System.out.println("after reversing linkedlist");
        print(newhead);
    }
}

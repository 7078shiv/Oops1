package LinkedList;

public class LinkedListUse {
    public static void printRecursive(Node<Integer> head){
        if(head==null){
            return ;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }
    public static boolean checkPallindrome(Node<Integer> head){
        int ll=0;
        if(head==null || head.next==null){
            return true;
        }
        for(Node<Integer> temp=head;temp!=null;temp=temp.next){
            ll++;
        }
        int fl=ll/2;
        if(ll%2==0){
        Node<Integer> fh=head;
            Node<Integer> fhh=head;
        Node<Integer> sh=null;
        for(int i=0;i<fl-1;i++){
            fh=fh.next;
        }
        sh=fh.next;
        fh.next=null;
        Node<Integer> curr=sh;
        Node<Integer> prev=null;
        Node<Integer> nextt=null;
        while(curr!=null){
            nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }
        sh=prev;
        Node<Integer> sech=sh;
        while(sech!=null){
            System.out.println(sech.data);
            sech=sech.next;
        }
        while(fhh!=null){
            if(fhh.data!=sh.data){
                return false;
            }
            fhh=fhh.next;
            sh=sh.next;
        }}
        else{
            Node fh=head;
            Node<Integer> fhh=head;
            Node sh=null;
            for(int i=0;i<fl;i++){
                fh=fh.next;
            }
            sh=fh.next;
            fh.next=null;
            Node<Integer> curr=sh;
            Node<Integer> prev=null;
            Node<Integer> nextt=null;
            while(curr!=null){
                nextt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextt;
            }
            sh=prev;
            Node<Integer> sech=sh;
            while(sech!=null){
                System.out.println(sech.data);
                sech=sech.next;
            }
            while(fhh.next!=null){
                if(fhh.data!=sh.data){
                    return false;
                }
                fhh=fhh.next;
                sh=sh.next;
            }
        }
        return true;
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
    public static void Increment(Node head){

        for(Node<Integer> temp=head;temp!=null;temp=temp.next){
            temp.data++;
        }
    }
    public static void print(Node head){

        for(Node i=head;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
    public static void main(String[] args) {
        Node head=createlinklist();
        //Increment(head);

       // System.out.println(checkPallindrome(head));
       // print(head);
        printRecursive(head);
    }
}

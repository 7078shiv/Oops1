package LinkedList;

import java.util.Scanner;

public class UserInput {
    public static void PrintR(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        PrintR(head.next);
    }
    public static void Reversell(Node<Integer> head){
        if(head==null){
            return ;
        }
        Reversell(head.next);
        System.out.print(head.data+" ");
    }
    public static Node<Integer> TakeInput(){
        Node<Integer> head = null,tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer> newnode=new Node<>(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
               /* Node<Integer> temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=new Node(data);*/
                tail.next=newnode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head=TakeInput();
        PrintR(head);
        System.out.println();
        Reversell(head);
    }
}

package Stack;
public class StackUsingLinkedList<T> {
    private Node<T> head;
    private int size;
    public StackUsingLinkedList(){
        head=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void push(T elem){
        if(head==null){
            head=new Node<T>(elem);
            size++;
        }
        else{
        Node<T> temp=head;
        head=new Node<>(elem);
        head.next=temp;
        size++;
        }
    }
    public T top(){
        if(head==null){
            return null;
        }
        return head.data;
    }
    public int pop(){
        Node<T> temp=head;
        head=head.next;
        size--;
        return (int) temp.data;

    }

    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack=new StackUsingLinkedList<>();
        for(int i=0;i<=5;i++){
            stack.push(i);
        }
        for(;!stack.isEmpty();){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
        System.out.println(stack.top());
    }
}

package Queue;

public class QueueUsingLinkedList<T> {
    Node<T> front;
    Node<T> rare;
    int size;
    public QueueUsingLinkedList(){
        front=null;
        rare=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public void enqueue(T ele){
        Node<T> n=new Node<>(ele);
        if(size==0){
            front=n;
            rare=n;
            size++;
        }
        else{
            rare.next=n;
            size++;
        }
    }
    public T dequeue() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }
        Node<T> temp=front;
        front=front.next;
        return temp.data;
    }
    public T front() throws queueEmptyException
    {
        if(front==null){
            throw new queueEmptyException();
        }
        return front.data;
    }

    public static void main(String[] args) throws queueEmptyException {
        QueueUsingLinkedList<String> Q=new QueueUsingLinkedList<>();
        Q.enqueue("ram");
        Q.enqueue("shivang");
        System.out.println(Q.front());
        System.out.println(Q.size());
        System.out.println(Q.dequeue());
        System.out.println(Q.dequeue());
    }
}

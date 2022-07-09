package Queue;
import java.util.Stack;
public class QueueUsingStack<T>{
    private Stack<T> s1;
    private Stack<T> s2;
    private int size;
    public QueueUsingStack(){
        s1=new Stack<>();
        s2=new Stack<>();
        size=0;
    }
    public void enqueue(T ele){
        s1.push(ele);
        size++;
    }
    public T dequeue(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        T temp=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        size--;
        return temp;
    }
    public int size(){
        return size;
    }
    public T front(){
        if(s1.isEmpty()){
            return null;
        }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        T f=s1.peek();
            return f;
    }
    public boolean isEmpty(){
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        System.out.println(q.front());
        System.out.println(q.size());
    }
}

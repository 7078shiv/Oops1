package Queue;

import java.util.Queue;
import java.util.LinkedList;
public class Stack {

    //Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;


    public Stack() {
        //Implement the Constructor
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        if(size==0){
            return true;
        }
        return false;
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(!q2.isEmpty()){
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }}
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        int t=q2.peek();
        q2.poll();
        size--;
        return t;
    }

    public int top() {
        //Implement the top() function
        return q2.peek();
    }
}
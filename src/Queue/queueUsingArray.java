package Queue;
import java.util.*;
public class queueUsingArray {
    private int[] data;
    int front;
  //  LinkedList<Integer> nn;
    int rare;
    int size;
    public queueUsingArray(int capacity){
      //  nn=new LinkedList<>();
        data=new int[capacity];
        front=-1;
        rare=-1;
        size=0;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
            return false;
    }
    public void enqueue(int ele){
       // if(size==data.length){
       //     throw new queueFullException();
      //  }
        if(size==data.length){
            int[] temp=data;
            data=new int[2*size];
            int j=0;
            for(int i=front;i<temp.length;i++) {
                data[j++] = temp[i];
            }
            for(int k=0;k<front-1;k++){
                data[j++]=temp[k];
            }
        }
    //    rare++;

        if(size==0){
            front=0;
        }
        rare=(rare+1)%data.length;
        data[rare]=ele;
        size++;
    }
    public int front() throws queueEmptyException{
        if(front==-1){
            throw new queueEmptyException();
        }
        return data[front];
    }
    public int dequeue() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }


            int n=data[front];
     //       front++;
     //  if(front==data.length){
     //      front=0;
     //  }
        front=(front+1)%data.length;
            size--;
       if(size==0){
           front=-1;
           rare=-1;
       }

        return n;
    }
}

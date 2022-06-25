package Stack;
/*
stack opetration;
push()
top()
pop()
size()
isEmpty()
 */
public class StackUsingArray {
private int[] arr;
private int topindex;
public StackUsingArray(int maxsizeofarray){
    arr=new int[maxsizeofarray];
    topindex=-1;
}
public int pop() throws StackEmptyException{
    if(topindex==-1){
        throw new StackEmptyException();
    }

    return arr[topindex--];
}
public  void doublecapacity(){
    System.out.println("double capacity");
    int[] temp=arr;
    arr=new int[2*temp.length];
    for(int i=0;i<temp.length;i++){
        arr[i]=temp[i];
    }
}
public  void push(int item) {
    if(topindex==arr.length-1){
        doublecapacity();
    }

        topindex++;
    arr[topindex]=item;

}
public  boolean isEmpty(){
    if(topindex==-1){
        return true;
    }
    return false;
}
public  int size(){
    return topindex+1;
}
public void top(){
    if(topindex==-1){
        System.out.println("stack is empty");
    }
    else{
        System.out.println(arr[topindex]);
    }
}
public void traverse(){
    for(int i=0;i<=topindex;i++){
        System.out.print(arr[i]+" ");
    }
}
}

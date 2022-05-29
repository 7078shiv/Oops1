public class DynamicArray {
    private int data[];
    private int nextelementIndex;
    public DynamicArray(){
        data=new int[5];
        nextelementIndex=0;
    }
    public int size(){
        return nextelementIndex;
    }
    public boolean isEmpty(){
        return nextelementIndex==0;
    }
    public int get(int index)throws ArrayIndexoutofbound{
        if(index>=nextelementIndex){
            throw new ArrayIndexoutofbound();
        }
        return data[index];
    }
    private void doublesize(){
        int temp[]=data;
        data=new int[2*nextelementIndex];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public void add(int item){
        if(nextelementIndex==data.length){
            doublesize();
        }
        data[nextelementIndex]=item;
        nextelementIndex++;
    }
    public void set(int index,int ele){
        for(int i=nextelementIndex;i>=index;i--){
            data[i]=data[i-1];
        }
        data[index]=ele;
    }
    public int removeLast(){
        int e=data[nextelementIndex-1];
        nextelementIndex--;
        return e;
    }
}

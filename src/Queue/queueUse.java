package Queue;
public class queueUse {
    public static void main(String[] args) throws queueEmptyException {
        queueUsingArray q=new queueUsingArray(2);
        q.enqueue(8);
        System.out.println(q.dequeue());
        for(int i=0;i<44;i++){
            q.enqueue(i);
        }
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.size());
        while(!q.isEmpty()){
            System.out.print(q.dequeue()+" ");
        }
        System.out.println();
        for (int i = 0; i < 33; i++) {
            q.enqueue(i);
        }
        q.dequeue();
        q.dequeue();
        System.out.println(q.front());

        while(!q.isEmpty()){
            System.out.print(q.dequeue()+" ");
        }
        System.out.println();
        System.out.println(q.isEmpty());
    }
}

package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    // queue is a interface;
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(10);
        q.add(20);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.size());
    }
}
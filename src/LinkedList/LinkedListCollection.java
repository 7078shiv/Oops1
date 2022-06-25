package LinkedList;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();// doubly linkedlist
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(0,200);
        list.addFirst(9);
        list.addLast(90);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.set(3,898);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for (int i:list) {
            System.out.print(i+" ");
        }
    }
}

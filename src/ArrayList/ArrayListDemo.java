package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(10);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(0,22);
        System.out.println(arr.get(0));
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        // for each loop
        for (int i:arr) {
            System.out.println(i);
        }
    }

}

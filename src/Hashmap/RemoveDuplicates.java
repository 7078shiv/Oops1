package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,3,2,2,3,1,6,2,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        Set<Integer> s=map.keySet();
        for(int i:s){
            System.out.println(i+" ");
        }
    }
}

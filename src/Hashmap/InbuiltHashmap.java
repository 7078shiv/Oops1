package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("abc",1);
        map.put("def",3);
        // size

        System.out.println(map.size());
        System.out.println(map.put("abc",4));
        System.out.println(map.size());
        System.out.println(map);
        // present
        if(map.containsKey("abc")){
            System.out.println("map contains abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("map constains abc1");
        }

        //getting the value
int v=0;
        if(map.containsKey("abc")){
             v=map.get("abc");
            System.out.println(v);
        }
        int v1=0;
        if(map.containsKey("abc1")){
         v1=map.get("abc1");// null pointer exception
        System.out.println(v1);
        }

      //  map.remove("abc");
        if(map.containsKey("abc")){
            System.out.println("map contains abc");
        }
        map.remove("abc1");// abc1 is not in the hashmap and
        // it will not do anything
        System.out.println("size of map");
        System.out.println(map.size());

        //iterate

        Set<String> keys=map.keySet();
        for(String i:keys){
            System.out.println(i+":"+map.get(i)+" ");
        }
        System.out.println(map.containsValue(4));
    }
}

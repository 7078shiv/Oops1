import java.util.*;
public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d=new DynamicArray();
        for(int i=1;i<=100;i++){
            d.add(i+100);
        }
        System.out.println(d.size());
        try{
        System.out.println(d.get(2));}
        catch(ArrayIndexoutofbound e){
            e.printStackTrace();
        }
        d.set(3,170);
        try{
        System.out.println(d.get(10));}
        catch (ArrayIndexoutofbound e){
            e.printStackTrace();
        }
        while(!d.isEmpty()){
            System.out.println(d.removeLast());
            System.out.println("size--"+d.size());
        }
    }
}

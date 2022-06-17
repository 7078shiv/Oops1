package ArrayList;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        ArrayList<Integer> ans=removeduplicates(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList removeduplicates(ArrayList<Integer> arr){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr.get(0));
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)!=arr.get(i)){
                ans.add(arr.get(i));
            }
        }
        return ans;
    }
}

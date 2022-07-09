package Stack;

import java.util.Stack;

public class StockQuestion {
    public static int[] stockspan(int[] arr){
        int co=1;
        int[] ans=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        int p=arr.length-1;
        for(int l=0;l<arr.length;l++){
            int n=s.pop();
            int k=arr.length;
            for(int j=p-1;j>=0;j--){
                if(arr[j]<n){
                    co++;
                }
                else{
                    break;
                }
            }
         //   k--;
            ans[p]=co;
            p--;
            co=1;
        }
       // ans[0]=1;
        return ans;
    }
    public static void print(int[] ans){
        for (int i:ans) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr={60,70,80,100,90,75,80,120};
        int[] ans= stockspan(arr);
        print(ans);
    }
}

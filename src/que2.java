import java.util.*;
public class que2 {
    public static void main(String[] args) {
        int[] arr={30,20,53,14};
        System.out.println(maximumProfit(arr));
    }
    public static int maximumProfit(int budget[]){
        int bgno=0;
        int[] arr=new int[budget.length];
        for(int i=0;i<budget.length;i++){
            for(int j=0;j<budget.length;j++){
                if(budget[i]<=budget[j]){
                    bgno++;
                }
            }
            arr[i]=bgno*budget[i];
            bgno=0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //int  mid = Math.floor ((0 + array.length)/2)
        return max;
    }
}

package CompetativeProgramming;
import java.util.*;
public class MaximumSubArraySum {
    public static int maxsubarraySum(int[] arr){    // time complexity O(n);
        int sum=0;
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            sum=Math.max(sum,sum+arr[i]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={-1,-2,-4,-3,-5,-2,5,2};
        System.out.println(maxsubarraySum(arr));
    }
}

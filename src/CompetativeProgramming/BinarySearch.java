package CompetativeProgramming;

public class BinarySearch {
    public static int search(int[] arr,int sele){
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        if(arr[mid]==sele){
            return mid;
        }
        while(left<right){
            mid=(left+right)/2;
            if(arr[mid]==sele){
                return mid;
            }
            else if (arr[mid]<sele) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,44,55,66,77};
        int n=66;
        System.out.println(search(arr,n));
        System.out.println(-1);
    }
}

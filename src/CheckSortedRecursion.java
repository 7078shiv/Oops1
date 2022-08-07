public class CheckSortedRecursion {
    public static boolean checkSorted(int[] arr,int lb,int ub){
        if(lb>=ub){
            return true;
        }
        if(arr[lb]>arr[lb+1]){
            if(checkSorted(arr,lb+1,ub)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        System.out.println(checkSorted(arr,0,arr.length-1));

    }
}

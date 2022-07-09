package CompetativeProgramming;

public class FindDuplicateNo {
    public static int DuplicateNo(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={42,3,9,8,6,5,4};
        System.out.println(DuplicateNo(arr));
    }
}

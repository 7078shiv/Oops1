package CompetativeProgramming;

public class InsertionSort {
    public static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>key){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={55,44,66,77,88,11,22};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

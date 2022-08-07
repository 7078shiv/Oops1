package CompetativeProgramming;

public class MergeSort {
    public static void Sort(int[] arr){
        mergesort(arr,0,arr.length-1);
    }
    public static void mergesort(int[] arr,int lb,int ub){
        if(lb>=ub){
            return;
        }
        int mid=(lb+ub)/2;
        mergesort(arr,lb,mid);
        mergesort(arr,mid+1,ub);
        merge(arr,lb,ub,mid);
    }
    public static void merge(int[] arr,int lb,int ub,int mid){
        int[] ans=new int[lb+ub];
        int i=lb;
        int j=mid+1;
        int c=0;
        while(i<=mid && j<=ub){
            if(arr[j]<arr[i]){
                ans[c]=arr[j];
                c++;
                j++;
            }
            else{
                ans[c]=arr[i];
                c++;
                i++;
            }
        }
        while(i<=mid){
            ans[c]=arr[i];
            c++;
            i++;
        }
        while(j<=ub){
            ans[c]=arr[j];
            c++;
            j++;
        }
        for(int m=0;m<ans.length;m++){
            arr[lb+m]=ans[m];
        }

    }
    public static void main(String[] args) {
        int[] arr={44,33,55,443,0,9,8,88,6,5,4,3,2,1};
        Sort(arr);
    }
}

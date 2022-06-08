
import java.util.Arrays;
public class Intersectionofarrays {
    public static void main(String[] args) {
        int[] arr1={6,9,8,5,9,2};
        int[] arr2={6,6,6,9,5,5};
        intersection(arr1,arr2);
    }
    public static void intersection(int[] arr1,int[] arr2){
        mergeSort(arr1);
        mergeSort(arr2);
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{j++;}

        }

    }
    public static void mergeSort(int[] input){
        int si=0;
        int ei=input.length-1;
        mergeSort(input,si,ei);
    }
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei);

    }
    public static void merge(int[] arr,int si,int ei){
        int mid=(si+ei)/2;
        int[] out=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int c=0;
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                out[c]=arr[j];
                c++;
                j++;
            }
            else{
                out[c]=arr[i];
                c++;
                i++;
            }
        }
        while(i<=mid){
            out[c]=arr[i];
            c++;
            i++;
        }
        while(j<=ei){
            out[c]=arr[j];
            c++;
            j++;
        }
        for(int m=0;m<out.length;m++){
            arr[si+m]=out[m];
        }
    }
}

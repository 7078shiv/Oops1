package CompetativeProgramming;

import java.util.Arrays;

public class ReverseArray {
    public static void maxoccuringBetter(int[] arr){// Time complexity O(nlogn)
        int[] ans=new int[2*arr.length];
        Arrays.sort(arr);
        int c=1;
        int count=0;
        int a=0,b=0;
        for(int i=0;i<arr.length;){
            if(arr[i]==arr[c]){
                count++;
                c++;
            }
            else{
                ans[a]=arr[count];
                ans[b]=count;
                i=count;
                a++;
            }
        }
    }
    public static void findMaxOccuringElement(int[] arr){
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    // arr[i]=101;
                }
            }
            ans[i]=count;
        }
        int max=ans[0];
        int secmax=ans[0];
        int ind=0;
        int ind2=0;
        for(int i=1;i<ans.length;i++){
            if(ans[i]>max) {
                max = ans[i];
                ind=i;
            }
        }
        for(int i=0;i<ans.length ;i++){
            if(ans[i]!=max){
                if(ans[i]>secmax){
                    secmax=ans[i];
                    ind2=i;
                }
            }
        }
        System.out.println("max occuring element is");
        System.out.println(arr[ind]);
        System.out.println("2 max occuring element is");
        System.out.println(arr[ind2]);
    }
    public static void maxand2max(int[] arr){  // its time compleity is O(n^2);

        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            int key=arr[i];
            for(int j=0;j!=i;j++){
                if(arr[i]==key){
                    count++;
                    arr[i]=101;
                }
            }
            ans[i]=count;
        }
    }
    public static int reverseno(int n){

        int rev=0;
        while(n>0){
            int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
        }
        return rev;
    }
    public static void swap(int a,int b){
    /*    a=a-b;
        b=a+b;
        a=b-a;
        System.out.println(a);
        System.out.println(b);*/
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        reverse(arr);
        swap(34,35);
        System.out.println(reverseno(1234));
        int[] arr2={1,2,3,4,5,6,1,2,1,1,4,5,7,8,9,10,11,2,2,2,2,2,10,10,10,10,10,10,10};
        findMaxOccuringElement(arr2);
    }
}

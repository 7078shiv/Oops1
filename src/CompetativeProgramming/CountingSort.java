package CompetativeProgramming;

public class CountingSort {
    public static int[] Sort(int[] arr){
        int[] temparr=new int[10];
        int c=0;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temparr[arr[i]]++;
        }
        for(int i=0;i<10;i++){
            if(temparr[i]!=0){
            for(int j=0;j<temparr[i];j++){
                ans[c]=i;
                c++;
            }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,1,3,2,2,4,5,6,8};
       int[] ans= Sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

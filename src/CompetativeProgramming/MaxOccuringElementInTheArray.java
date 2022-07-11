package CompetativeProgramming;

public class MaxOccuringElementInTheArray {
    public static int maxOccuringelement(int[] arr){    //--------------->>>>>>>> O(n)
        int[] temparr=new int[100];
        for(int i=0;i<arr.length;i++){
            temparr[arr[i]]++;
        }
        int max=temparr[0];
        int index=0;
        for(int i=0;i<temparr.length;i++){
            if(temparr[i]>max){
                max=temparr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1,2,1,1,4,5,7,8,9,10,11,11,11,11,11,11,11};
        System.out.println(maxOccuringelement(arr));
    }
}

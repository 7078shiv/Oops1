public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = 12;
        System.out.println(tripletSum(arr, num));
    }
    public static int tripletSum(int[] arr, int num) {
        int c = 0;
        int i = 0;
        int j = 1;
        int k = 2;
        while (i < arr.length - 2 && j < arr.length - 1) {
            while (k < arr.length) {
                if(arr[i]+arr[j]+arr[k]==num){
                    c++;
                    k++;
                }
                k++;
            }
            i++;
            j++;
        }
        return c;
    }
}
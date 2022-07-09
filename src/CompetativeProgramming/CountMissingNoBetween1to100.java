package CompetativeProgramming;

import java.util.Scanner;

public class CountMissingNoBetween1to100 {

    public static void main(String[] args) {
        int c=0;
        Scanner s=new Scanner(System.in);
        int[] arr=new int[100];
        for(int i=1;i<100;i++){
            arr[c]=i;
            c++;
        }
        arr[50]=0;
        int tsum=50*99;
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=arr[i];
        }
        System.out.println(tsum-sum);
    }
}

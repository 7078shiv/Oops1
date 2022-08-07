package CompetativeProgramming;

import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int size = s.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size;j++){
                arr[j]=s.nextInt();
            }
            int c=0;
            for(int k=0;k<size;k++){
                while(arr[k]!=0){
                    c++;
                    if(arr[k]%2==0){
                        arr[k]=arr[k]/2;

                    }
                    else{
                        arr[k]=(arr[k]-1)/2;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
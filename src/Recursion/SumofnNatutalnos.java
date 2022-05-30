package Recursion;

import java.util.Scanner;

public class SumofnNatutalnos {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sa=sum(n-1);
        return n+sa;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter till you want to find sum of first n natural no");
        int n=s.nextInt();
        System.out.println(sum(n));
    }
}

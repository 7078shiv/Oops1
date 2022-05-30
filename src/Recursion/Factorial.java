package Recursion;

import java.util.Scanner;

public class Factorial {
    public int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int sa=fact(n-1);
        return sa*n;
    }
    public static void main(String[] args) {
        Factorial f=new Factorial();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no that you want to find factorial");
        int n=s.nextInt();
        System.out.println("factorial of "+n+" is "+f.fact(n));
    }
}

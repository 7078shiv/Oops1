package CompetativeProgramming;

import java.util.Scanner;

public class PrintPrime1toN {
    public static void PrimeNoBetter(int n){//  slave of erenthesis
        boolean[] primeset=new boolean[n+1];
        for(int i=0;i<n+1;i++){
            primeset[i]=true;
        }
        primeset[0]=false;
        primeset[1]=false;
        for(int j=2;j*j<=n;j++){
            if(primeset[j]==true){
                for(int i=j*j;i<=n;i+=j){
                    primeset[i]=false;
                }
            }
        }
        for(int i=0;i<n+1;i++){
            if(primeset[i]==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void printPrime(int n){
        for(int i=2;i<=n;i++){
            int f=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0)
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("give no upto you want to print prime no");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       // printPrime(n);
        PrimeNoBetter(n);
        
    }
}

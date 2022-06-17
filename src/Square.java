import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        squarePrint(n);
    }
    public static void squarePrint(int n){
        for (int i = 1; i <=n; i++) {
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
                System.out.println();
            }
        }
        }
    }


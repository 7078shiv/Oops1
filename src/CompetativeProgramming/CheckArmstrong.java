package CompetativeProgramming;

public class CheckArmstrong {
    public static boolean checkArmstrongNo(int n){
        int sum=0;
        int orignalno=n;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
       // System.out.println(sum);
        return sum==orignalno;
    }
    public static void main(String[] args) {
        System.out.println(checkArmstrongNo(120));
    }
}

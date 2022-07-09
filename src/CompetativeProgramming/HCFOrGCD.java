package CompetativeProgramming;

public class HCFOrGCD {
    public static int LCM(int HCF,int m,int n){
        return (m*n)/HCF;
    }
    public static int Hcf(int m,int n){
        int min=0;
        if(m<=n){
            min=m;
        }
        min=n;
        while(min>=0){
            if(m%min==0 && n%min==0){
                return min;
            }
            min--;
        }
        return min;
    }
    public static void main(String[] args) {
        int GCD=Hcf(26,13);
        System.out.println(GCD);
        System.out.println(LCM(GCD,26,13));
    }
}

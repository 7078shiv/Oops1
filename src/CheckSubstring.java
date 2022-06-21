public class CheckSubstring {
    public static void main(String[] args) {
        String s1="GeeksForGeeks";
        String s2="For";
        System.out.println(strstr(s1,s2));
    }
    public static int strstr(String s,String x){
        return s.indexOf(x);
    }
}

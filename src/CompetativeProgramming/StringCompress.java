package CompetativeProgramming;

public class StringCompress {
    public static String compress(char[] chars) {
        String s="";
        for(int i=0;i<chars.length;i++){
            int c=1;
            for(int j=i+1;j<chars.length;j++) {
                if (chars[i] == chars[j]) {
                    c++;
                }
            }
            s=s+chars[i]+c;
            i=c;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] arr={'a','a','b','b','c','c','c'};
        //System.out.println(compress(arr));
        String str=compress(arr);
        System.out.println(str);
    }
}

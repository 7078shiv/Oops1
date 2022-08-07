package BinaryTree;
public class CheckWhetherStringContainAllCharacterOrNot {
    public static boolean check(String str){
        String s="";
        int count=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')){
                if(!s.contains(str.charAt(i)+"")){
                    s+=str.charAt(i);
                    count++;
                }
            }
        }
        if(count==26){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String string ="abcdefghijkmnopqrstuvwxyzppppppqqqql";
        System.out.println(check(string));
    }
}

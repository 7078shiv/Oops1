package CompetativeProgramming;
 class pair{
    int start;
    int end;
    public pair(int start ,int end){
        this.start=start;
        this.end=end;
    }
}
public class Amazone {

    public static pair checkStartAndEnd(int[] arr,int k){
        int startpos=-1;
        int endingpos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) {
                startpos = i;
                break;
            }
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==k){
                endingpos=j;
                break;
            }
        }
        pair ans=new pair(startpos,endingpos);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,5,5,7,11,11};
        int k=5;
        pair ans=checkStartAndEnd(arr,k);
        System.out.println("starting pos");
        System.out.println(ans.start);
        System.out.println("ending pos");
        System.out.println(ans.end);
    }
}

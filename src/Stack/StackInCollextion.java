package Stack;

import java.util.Stack;

public class StackInCollextion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Stack<Integer> stack=new Stack<>();
     //   stack.push(10);
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        //stack.
        //System.out.println(stack.pop());
     //   System.out.println(stack.size());
       // System.out.println(stack.peek());
        //System.out.println(stack.search(10));
        //System.out.println(stack.isEmpty());
    }
}

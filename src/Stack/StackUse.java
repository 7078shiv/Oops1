package Stack;

import java.util.Scanner;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException{
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=s.nextInt();
        StackUsingArray stack=new StackUsingArray(size);
       // int[] arr={1,2,3,4,5};
        for(int i=0;i<34;i++){
            stack.push(i);
        }
         //   stack.push(10);
        for(;!stack.isEmpty();){
            System.out.println(stack.pop());
        }
       // stack.pop();
        stack.top();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
       // stack.traverse();
    }
}

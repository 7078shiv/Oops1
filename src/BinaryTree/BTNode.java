package BinaryTree;

public class BTNode<T> {
    public T data;
    public BTNode<T> Lc;// left child
   public BTNode<T> Rc;// right child
    public BTNode(T data){
        this.data=data;
        Lc=null;
        Rc=null;
    }
}

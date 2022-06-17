package Generics;

public class Print {
    public static<T extends printInterface> void print(T[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i].Print();
 //           System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]="shivang shrivastava";
        }
        //print(arr);
        Vehicle[] v=new Vehicle[5];
        for (int i = 0; i < v.length; i++) {
            v[i]=new Vehicle("s presso",687878);
        }
        print(v);
        Student[] s=new Student[5];
        for (int i = 0; i < s.length; i++) {
            s[i]=new Student(55);
        }
        print(s);
    }
}

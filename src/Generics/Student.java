package Generics;

public class Student implements printInterface {
  int rollno;
  public Student(int rollno){
      this.rollno=rollno;
  }

    public void Print(){
        System.out.println(rollno);
    }

}

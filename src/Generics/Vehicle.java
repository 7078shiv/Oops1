package Generics;

public class Vehicle implements printInterface {
    String company;
    int price;
    public Vehicle(String company,int price){
        this.company=company;
        this.price=price;
    }
    public void Print(){
        System.out.println(company+" "+price);
    }

}

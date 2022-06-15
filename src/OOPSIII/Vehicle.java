package OOPSIII;
public abstract class  Vehicle implements Vehiclesinterface {// if we make a class final so this class cannot be inherited;
    private String color;
    int maxSpeed;
    public Vehicle(){
        System.out.println("vehicle's constructor");
        maxSpeed=60;
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicles Constructor");
       this.maxSpeed=maxSpeed;
   }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void  print()// if we make a method final so it cannot to override;
    {
        System.out.println("vehicle"+"color "+color+" maxspeed "+maxSpeed);

    }
    public abstract boolean IsMotering();// abstract maeans it is incomplete later some other class will decide its functionality;
    public abstract String getCompany();


}

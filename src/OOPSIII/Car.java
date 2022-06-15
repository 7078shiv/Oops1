package OOPSIII;
public abstract class  Car extends Vehicle implements CarInterface,Vehiclesinterface {
    int numDoors = 10;// if we make a variable final so we cannot chding
    // of inherithig the class in which abstract mehodange its value;
       // return true;

       int numGears;
    //
    //    public boolean IsMotering(){// either car class
    //        // make abstract or creating its method .Because of overri
    // and the class is also abstract.const clacuatesalery=function(initialsalery){
    public Car(){
       // super(100);
        System.out.println("Car constructor");
        numDoors=4;
         numGears=5;
    }
    public Car(int numDoors,int maxSpeed)
    {
        super(maxSpeed);
        System.out.println("car contructor");
        this.numDoors=numDoors;
    }
    public void print(){
        super.print();
        System.out.println("car numdoors "+numDoors+"numGears"+numGears);
    }



    public void printmaxspeed(){
        maxSpeed=150;
        System.out.println(maxSpeed+" "+maxSpeed);
    }
}
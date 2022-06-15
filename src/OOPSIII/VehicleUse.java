package OOPSIII;

public class VehicleUse implements CarInterface,Vehiclesinterface  {
    public static void main(String[] args) {
        Vehicle v;
        Vehiclesinterface vi;
        //vi=new Car() {

        }
        //Car c=new Car();
       // v=new Car();
      //  v.print();
       // System.out.println(v.IsMotering());
        //v=new Bycycle();


    @Override
    public boolean IsMotering() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }
}
   //     Car c=new Car();
       // v=new Car();
      //  v= new Vehicle() {
          //  @Override
        //    public boolean IsMotering() {
        //        return false;
        //    }

     //   int maxSpeed = v.maxSpeed;
     //   v.print();


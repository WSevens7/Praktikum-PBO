/*Adib Willy Kusuma Adrigantara*/
/*24060122140158*/

public abstract class Vehicle {
    public double calcFuelEfficiency(){
        return 10;
    }
    public double calcTripDistance(){
        return 20;
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }
}

/*Adib Willy Kusuma Adrigantara*/
/*24060122140158*/

public abstract class Airplane extends Vehicle implements IFleyer{
    public void takeOff(){
        System.out.println("take-off");
    }
    public void land(){
        System.out.println("mendarat");
    }
    public void fly(){
        System.out.println("terbang");
    }
}
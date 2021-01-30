/**
 * child class of vehicledecorator
 */
public class Rims extends VehicleDecorator{

    private Vehicle vehicle;

    /**
     * sets vehicle to whichever is chosen in driver
     * @param vehicle sets vehicle to whichever was chosen
     */
    public Rims(Vehicle vehicle){

        this.vehicle = vehicle;

    }

    /**
     * returns cool rims when selected
     */
    public String toString(){

        return vehicle.toString() + ", cool rims";

    }

    /**
     * adds 200 to cost of whatever car was chosen
     */
    public double getCost(){

        return vehicle.getCost() + 200;

    }
    
}

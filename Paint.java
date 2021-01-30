/**
 * child class of vehicledecorator
 */
public class Paint extends VehicleDecorator {

    private Vehicle vehicle;

    /**
     * sets vehicle to whichever is chosen in driver
     * @param vehicle kind of vehicle 
     */
    public Paint(Vehicle vehicle){

        this.vehicle = vehicle;

    }

    /**
     * prints to screen when paint is chosen 
     */
    public String toString(){

        return vehicle.toString() + ", fancy paint";

    }

    /**
     * adds 150 to whichever vehicle cost dependent on what car was chosen
     */
    public double getCost(){

        return vehicle.getCost() + 150;
    }
    
}

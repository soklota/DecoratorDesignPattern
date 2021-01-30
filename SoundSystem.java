/**
 * child class of vehicledecorator
 */
public class SoundSystem extends VehicleDecorator{
    
    private Vehicle vehicle;

    /**
     * sets vehicle to whichever chosen
     * @param vehicle kind of vehicle
     */
    public SoundSystem(Vehicle vehicle){

        this.vehicle = vehicle;

    }

    /**
     * returns awesome sound to screen in addition to whatever car was chosen
     */
    public String toString(){

        return vehicle.toString() + ", awesome sound";

    }

    /**
     * add 350 to cost of whatever car was chosen
     */
    public double getCost(){

        return vehicle.getCost() + 350;

    }
}

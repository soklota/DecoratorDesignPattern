/**
 * Child of vehicle
 */
public class SportsCar extends Vehicle {
    
    /**
     * sets description to Sports Car
     */
    public SportsCar(){

        this.description = "Sports Car";

    }

    /**
     * returns 30000 for cost of sports car
     */
    public double getCost(){

        return 30000;
    }
}

/**
 * Author: Sydney Oklota, parent abstract class of sedan, sports car, and compact 
 */

public abstract class Vehicle{

    protected String description;
    
    /**
     * Returns the kind of vehicle
     */
    public String toString(){
        
        return description;

    }

    /**
     * @return cost of each vehicle
     */
    public abstract double getCost();
}
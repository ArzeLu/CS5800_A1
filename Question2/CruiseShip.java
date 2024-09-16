public class CruiseShip extends Ship{
    private int maximumPassengers;

    public CruiseShip(String ship, String manufactureYear, int maximumPassengers){
        super(ship, manufactureYear);
        this.maximumPassengers = maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers){
        this.maximumPassengers = maximumPassengers;
    }

    public int getMaximumPassengers(){
        return maximumPassengers;
    }
    
    @Override
    public void printInfo(){
        System.out.println("Ship name: " + ship);
        System.out.println("Maximum passenger capacity: " + String.valueOf(maximumPassengers));
	System.out.println();
    }
}
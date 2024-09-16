public class Ship{
    protected String ship;
    protected String manufactureYear;

    public Ship(String ship, String manufactureYear){
        this.ship = ship;
        this.manufactureYear = manufactureYear;
    }

    public void setShipName(String ship){
        this.ship = ship;
    }

    public void setManufactureYear(String manufactureYear){
        this.manufactureYear = manufactureYear;
    }

    public String getShipName(){
        return ship;
    }

    public String getManufactureYear(){
        return manufactureYear;
    }
    
    public void printInfo(){
        System.out.println("Ship name: " + ship);
        System.out.println("Built in: " + String.valueOf(manufactureYear));
	System.out.println();
    }
}
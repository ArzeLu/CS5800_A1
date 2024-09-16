public class CargoShip extends Ship{
    private int cargoCapacity;
    
    public CargoShip(String ship, String manufactureYear, int cargoCapacity){
        super(ship, manufactureYear);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity(){
        return cargoCapacity;
    }
    
    @Override
    public void printInfo(){
        System.out.println("Ship name: " + ship);
        System.out.println("Cargo Capacity: " + cargoCapacity);
	System.out.println();
    }
}
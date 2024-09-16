public class Main{

    public static void main(String[] args){
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ship A", "1995");
        ships[1] = new CruiseShip("Ship B", "1984", 532);
        ships[2] = new CargoShip("Ship C", "2011", 374);

        for(Ship ship: ships)
            ship.printInfo();
    }
}
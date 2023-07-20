package Parking;

public class ParkingLotMain {
    public static void main(String[] args) {
        Level1 level1 = new Level1();
        Level2 level2 = new Level2();
        level1.createSmallSpots();
        level1.createCompactSpots();
        level1.createLargeSpots();
        level2.createSmallSpots();
        level2.createCompactSpots();
        level2.createLargeSpots();

        level1.getListOfAvailableSpots("motorcycle");
        level1.parkVehicleToLevel1(1);
        level1.getListOfAvailableSpots("motorcycle");

        level2.parkVehicleToLevel2(11);
        level2.parkVehicleToLevel2(12);
        level2.parkVehicleToLevel2(13);
        level2.parkVehicleToLevel2(14);

        level2.getListOfAvailableSpots("car");




        Motorcycle moto1 = new Motorcycle("AS123", "red");
        moto1.getParkingSpotNeeded();


//        moto1.getListOfAvailableSpots(1, "motorcycle");
//
////        Car car1 = new Car("DG325", "black");
//        car1.getParkingSpotNeeded();
//        car1.getListOfAvailableSpots(2);
//
//        Bus bus1 = new Bus("ERTY3546", "yellow");
//        bus1.getParkingSpotNeeded();
//        bus1.getListOfAvailableSpots(1);
////        bus1.takeSpot(1, 26);
//        bus1.getListOfAvailableSpots(1);


    }
}

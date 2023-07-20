package Parking;

public class Motorcycle extends Vehicle {

    public Motorcycle(String vPlateNumber, String vColor) {
        super(Consts.MOTORCYCLE_VEHICLE_TYPE, vPlateNumber, vColor);
    }


    public void getParkingSpotNeeded() {
        super.whereVehicleCanPark(Consts.MOTORCYCLE_VEHICLE_TYPE);
    }


}

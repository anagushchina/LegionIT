package Parking;

public class Car extends Vehicle {

    public Car(String vPlateNumber, String vColor) {
        super(Consts.CAR_VEHICLE_TYPE, vPlateNumber, vColor);
    }
    public void getParkingSpotNeeded() {
        super.whereVehicleCanPark(Consts.CAR_VEHICLE_TYPE);
    }




}

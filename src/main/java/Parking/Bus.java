package Parking;

public class Bus extends Vehicle {

    public Bus(String vPlateNumber, String vColor) {
        super(Consts.BUS_VEHICLE_TYPE, vPlateNumber, vColor);
    }

    public void getParkingSpotNeeded() {
        super.whereVehicleCanPark(Consts.BUS_VEHICLE_TYPE);
    }




}

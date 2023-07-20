package ParkingLot;

public class Car extends Vehicle{

    public Car(String vPlateNumber, String vColor) {
        super(Consts.CAR_VEHICLE_TYPE, vPlateNumber, vColor);
    }

    public void printVehicleInfo() {
        super.printVehicleInfo(Consts.CAR_VEHICLE_TYPE);
    }

    public void parkVehicle(int level, int spotId) {
        super.parkVehicle(level, spotId, Consts.CAR_VEHICLE_TYPE);
    }



}

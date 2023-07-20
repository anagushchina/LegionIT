package ParkingLot;

public class Bus extends Vehicle{

    public Bus(String vPlateNumber, String vColor) {
        super(Consts.BUS_VEHICLE_TYPE, vPlateNumber, vColor);
    }


    public void printVehicleInfo() {
        super.printVehicleInfo(Consts.BUS_VEHICLE_TYPE);
    }

    public void parkVehicle(int level, int spotId) {
        super.parkVehicle(level, spotId, Consts.BUS_VEHICLE_TYPE);
    }



}

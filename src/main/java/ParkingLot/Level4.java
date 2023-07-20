package ParkingLot;

import java.util.Map;

public class Level4 extends Level{

    public Level4() {
        super(Consts.LEVEL_4);
    }

    public Map<Integer, String> createSmallSpots() {
        return super.createSmallSpots(Consts.LEVEL_4);
    }

    public Map<Integer, String> createCompactSpots() {
        return super.createCompactSpots(Consts.LEVEL_4);
    }

    public Map<Integer, String> createLargeSpots() {
        return super.createLargeSpots(Consts.LEVEL_4);
    }

    public void getListOfAvailableSpots(String vehicleType) {
        super.getListOfAvailableSpots(Consts.LEVEL_4, vehicleType);
    }
}

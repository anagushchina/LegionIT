package ParkingLot;

import java.util.Map;

public class Level2 extends Level{

    public Level2() {
        super(Consts.LEVEL_2);
    }

    public Map<Integer, String> createSmallSpots() {
        return super.createSmallSpots(Consts.LEVEL_2);
    }

    public Map<Integer, String> createCompactSpots() {
        return super.createCompactSpots(Consts.LEVEL_2);
    }

    public Map<Integer, String> createLargeSpots() {
        return super.createLargeSpots(Consts.LEVEL_2);
    }

    public void getListOfAvailableSpots(String vehicleType) {
        super.getListOfAvailableSpots(Consts.LEVEL_2, vehicleType);
    }
}

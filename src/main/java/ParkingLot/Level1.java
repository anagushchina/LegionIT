package ParkingLot;

import java.util.Map;

public class Level1 extends Level{

    public Level1() {
        super(Consts.LEVEL_1);
    }

    public Map<Integer, String> createSmallSpots() {
        return super.createSmallSpots(Consts.LEVEL_1);
    }

    public Map<Integer, String> createCompactSpots() {
        return super.createCompactSpots(Consts.LEVEL_1);
    }

    public Map<Integer, String> createLargeSpots() {
        return super.createLargeSpots(Consts.LEVEL_1);
    }

    public void getListOfAvailableSpots(String vehicleType) {
        super.getListOfAvailableSpots(Consts.LEVEL_1, vehicleType);
    }
}

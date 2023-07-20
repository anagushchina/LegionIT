package ParkingLot;

import java.util.Map;

public class Level3 extends Level{

    public Level3() {
        super(Consts.LEVEL_3);
    }

    public Map<Integer, String> createSmallSpots() {
        return super.createSmallSpots(Consts.LEVEL_3);
    }

    public Map<Integer, String> createCompactSpots() {
        return super.createCompactSpots(Consts.LEVEL_3);
    }

    public Map<Integer, String> createLargeSpots() {
        return super.createLargeSpots(Consts.LEVEL_3);
    }

    public void getListOfAvailableSpots(String vehicleType) {
        super.getListOfAvailableSpots(Consts.LEVEL_3, vehicleType);
    }
}

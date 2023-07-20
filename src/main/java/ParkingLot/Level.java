package ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class Level {

    public int level;
    public Level(int level){
        this.level=level;
    }

    public Map<Integer, String> createSmallSpots(int level) {
        Map<Integer, String> smallSpots = new HashMap<Integer, String>();
        for (int i = 1; i <= 10; i++) {
            smallSpots.put(i, "small");
        }
        return smallSpots;
    }

    public Map<Integer, String> createCompactSpots(int level) {
        Map<Integer, String> compactSpots = new HashMap<Integer, String>();
        for (int i = 11; i <= 25; i++) {
            compactSpots.put(i, "compact");
        }
        return compactSpots;
    }

    public Map<Integer, String> createLargeSpots(int level) {
        Map<Integer, String> largeSpots = new HashMap<Integer, String>();
        for(int i=26; i<=40; i++){
            largeSpots.put(i, "large");
        }
        return largeSpots;
    }


    public void getListOfAvailableSpots(int level, String vehicleType) {
        if (vehicleType.equals("motorcycle")) {
            System.out.println(String.format("The list of available spots for a %s on the level%d:", vehicleType, level));
            System.out.println(createSmallSpots(level));
            System.out.println(createCompactSpots(level));
            System.out.println(createLargeSpots(level));
            System.out.println();
        } else if (vehicleType.equals("car")) {
            System.out.println(String.format("The list of available spots for a %s on the level%d:", vehicleType, level));
            System.out.println(createCompactSpots(level));
            System.out.println(createLargeSpots(level));
            System.out.println();
        } else if (vehicleType.equals("bus")) {
            System.out.println(String.format("The list of available spots for a %s on the level%d:", vehicleType, level));
            System.out.println(createLargeSpots(level));
            System.out.println();
        } else{
            System.out.println("Error: wrong vehicle type");
            System.out.println();
        }
    }



}

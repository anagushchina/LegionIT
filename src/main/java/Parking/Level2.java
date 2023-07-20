package Parking;

import java.util.HashMap;
import java.util.Map;

public class Level2  {
    Map<Integer, String> smallSpots = new HashMap<Integer, String>();
    Map<Integer, String> compactSpots = new HashMap<Integer, String>();
    Map<Integer, String> largeSpots = new HashMap<Integer, String>();

    public Map<Integer, String> getSmallSpots() {
        return smallSpots;
    }

    public Map<Integer, String> getCompactSpots() {
        return compactSpots;
    }

    public Map<Integer, String> getLargeSpots() {
        return largeSpots;
    }



    public Map<Integer, String> createSmallSpots( ) {
        for (int i = 1; i <= 10; i++) {
            smallSpots.put(i, "small");
        }
        return smallSpots;
    }

    public Map<Integer, String> createCompactSpots( ) {
        for (int i = 11; i <= 25; i++) {
            compactSpots.put(i, "compact");
        }
        return compactSpots;
    }

    public Map<Integer, String> createLargeSpots( ) {
        for(int i=26; i<=40; i++){
            largeSpots.put(i, "large");
        }
        return largeSpots;
    }


    public void getListOfAvailableSpots(String vehicleType) {
        if (vehicleType.equals("motorcycle")) {
            System.out.println("The list of available spots:");
            System.out.println(smallSpots);
            System.out.println(compactSpots);
            System.out.println(largeSpots);
        } else if (vehicleType.equals("car")) {
            System.out.println("The list of available spots:");
            System.out.println(compactSpots);
            System.out.println(largeSpots);
        } else if (vehicleType.equals("bus")) {
            System.out.println("The list of available spots:");
            System.out.println(largeSpots);
        }
    }

    public void parkVehicleToLevel2(int spotID) {

        if(spotID<=10){
            smallSpots.remove(spotID);
        }
        else if(spotID>10 && spotID<=25){
            compactSpots.remove(spotID);
        }
        else if(spotID>25 && spotID<=40){
            largeSpots.remove(spotID);
        }
    }



}

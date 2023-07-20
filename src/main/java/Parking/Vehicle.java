package Parking;

public abstract class Vehicle {
    String vehicleType;
    String vehiclePlateNumber;
    String vehicleColor;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }


    public Vehicle(String vType, String vPlateNumber, String vColor) {
        this.vehicleType = vType;
        this.vehiclePlateNumber = vPlateNumber;
        this.vehicleColor = vColor;
    }

    void whereVehicleCanPark(String vehicleType) {

        if (vehicleType.equals("motorcycle")) {
            System.out.println("Motorcycles can park in any spot");
        } else if (vehicleType.equals("car")) {
            System.out.println("Cars can park in either a single compact spot or a single large spot");
        } else if (vehicleType.equals("bus")) {
            System.out.println("buses can park in five large spots that are consecutive and within the same row. It cannot park in small spots");
        } else {
            System.out.println("Error: wrong vehicle type");
        }
    }




}






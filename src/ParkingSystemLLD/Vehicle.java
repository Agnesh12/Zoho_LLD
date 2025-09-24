package ParkingSystemLLD;

public class Vehicle {
    private String VehicleNumber;
    private String vehicleColor;
    private VehicleType vehicleType;
    public Vehicle(String VehicleNumber, String vehicleColor, VehicleType vehicleType) {
        this.VehicleNumber = VehicleNumber;
        this.vehicleColor = vehicleColor;
        this.vehicleType = vehicleType;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}

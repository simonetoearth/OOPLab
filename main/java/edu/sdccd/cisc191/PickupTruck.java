package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle{
    private int cargoCapacity;
    public PickupTruck(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int cargoCapacity) {
        super(manufacturer, milesOnVehicle, price, numberOfSeats, options);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

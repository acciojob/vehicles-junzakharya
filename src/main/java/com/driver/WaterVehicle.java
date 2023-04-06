package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
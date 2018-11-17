package designquestion.parking;

import java.util.ArrayList;

public abstract class Vehicle {

    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

    protected String licencePlate;
    protected VehicleSize size;
    protected int spotNeeded;


    public int getSpotNeeded() {
        return spotNeeded;
    }

    public void parkinSpot(ParkingSpot s)
    {
        parkingSpots.add(s);
    }

    public VehicleSize getSize() {
        return size;
    }

    protected void cleanSpot(){

    }

    protected void parkVechicle(){
        
    }

    public abstract boolean canFitInSpot();
}

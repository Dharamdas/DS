package designquestion.parking;

public class Car extends Vehicle {

    public Car(){
        spotNeeded=1;
        size=VehicleSize.Compact;
    }
    @Override
    public boolean canFitInSpot() {
        return false;
    }
}

package designquestion.parking;

public class Bus extends Vehicle {

    public Bus(){
        spotNeeded=5;
        size=VehicleSize.Large;
    }

    @Override
    public boolean canFitInSpot() {
        return false;
    }
}

package Task_2;

public class Bus extends Vehicle {

    private final double SPEED_BUS_COEFFICIENT = 0.6;

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * SPEED_BUS_COEFFICIENT;
    }
  
}

package Task_2;

public class Car extends Vehicle {

    private final double SPEED_CAR_COEFFICIENT = 0.8;

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * SPEED_CAR_COEFFICIENT;
    }
  
}

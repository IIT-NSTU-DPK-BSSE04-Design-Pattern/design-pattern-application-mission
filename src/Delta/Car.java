package Delta;

public class Car extends VehicleDecorator {
    public Car(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + "This is a car";
    }
    public String body() {
        return decoratedVehicle.body()+"Capsule Shape Car";
    }
    public String wheels() {
        return super.getDescription();
    }

    @Override
    public String engine() {
        return super.engine();
    }

    @Override
    public String assemblyProcess() {
        return super.engine();
    }
}

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
        return decoratedVehicle.wheels()+("Cars wheel");
    }

    @Override
    public String engine() {
        return decoratedVehicle.engine()+("cars engine");
    }

    @Override
    public String assemblyProcess() {
        return super.engine()+("cars assemble process");
    }
}

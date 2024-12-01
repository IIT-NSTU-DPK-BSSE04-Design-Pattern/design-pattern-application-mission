package Delta;

public class Motorcycle extends VehicleDecorator{
    public Motorcycle(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + "This is a Motorcycle";
    }
    public String body() {
        return decoratedVehicle.body()+"Body of motorcycle is smaller";
    }
    public String wheels() {
        return decoratedVehicle.wheels()+("Two wheels");
    }

    @Override
    public String engine() {
        return decoratedVehicle.engine()+("a smaller engine");
    }

    @Override
    public String assemblyProcess() {
        return decoratedVehicle.engine()+("motorcycle assemble process");
    }
}

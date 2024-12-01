package Delta;

public class Truck extends VehicleDecorator{
    public Truck(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + "This is a Truck";
    }
    public String body() {
        return decoratedVehicle.body()+"Large body of truck";
    }
    public String wheels() {
        return decoratedVehicle.wheels()+("truck wheel");
    }

    @Override
    public String engine() {
        return decoratedVehicle.engine()+("truck engine");
    }

    @Override
    public String assemblyProcess() {
        return super.engine()+("truck assemble process");
    }
}

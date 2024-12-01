package Delta;

public class VehicleDecorator implements Vehicle{

    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle vehicle){
        this.decoratedVehicle = vehicle;
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription();
    }

    @Override
    public String body() {
        return decoratedVehicle.body();
    }

    @Override
    public String wheels() {
        return decoratedVehicle.wheels();
    }

    @Override
    public String engine() {
        return decoratedVehicle.engine();
    }

    @Override
    public String assemblyProcess() {
        return decoratedVehicle.assemblyProcess();
    }
}

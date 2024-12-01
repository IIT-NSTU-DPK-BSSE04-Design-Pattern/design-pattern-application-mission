package Delta;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new SampleVehicle();

        vehicle = new Car(vehicle);
        System.out.println(vehicle.getDescription());
        System.out.println(vehicle.body());
        System.out.println(vehicle.engine());
        System.out.println(vehicle.wheels());
        System.out.println(vehicle.assemblyProcess());

        vehicle = new Truck(vehicle);
        System.out.println(vehicle.getDescription());
        System.out.println(vehicle.body());
        System.out.println(vehicle.engine());
        System.out.println(vehicle.wheels());
        System.out.println(vehicle.assemblyProcess());

        vehicle = new Motorcycle(vehicle);
        System.out.println(vehicle.getDescription());
        System.out.println(vehicle.body());
        System.out.println(vehicle.engine());
        System.out.println(vehicle.wheels());
        System.out.println(vehicle.assemblyProcess());


    }
}

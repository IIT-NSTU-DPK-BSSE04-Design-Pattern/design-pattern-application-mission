package Delta;

public class Main {
    public static void main(String[] args) {

        SampleVehicle sampleVehicle = new SampleVehicle();

        sampleVehicle = new Car(sampleVehicle);

        System.out.println(car.getDescription());
        System.out.println(car.body());
        System.out.println(car.wheels());
        System.out.println(car.engine());
        System.out.println(car.assemblyProcess());


    }
}

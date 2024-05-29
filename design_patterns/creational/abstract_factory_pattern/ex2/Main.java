package design_patterns.creational.abstract_factory_pattern.ex2;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new OrdinaryVehicleFactory();
        System.out.println(factory.getVehicle("TATA").getMileage());
        System.out.println(factory.getVehicle("MAHINDRA").getMileage());
        try {
            System.out.println(factory.getVehicle("AUDI").getMileage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        VehicleFactory factoryLux = new LuxuryVehicleFactory();
        System.out.println(factoryLux.getVehicle("AUDI").getMileage());
        System.out.println(factoryLux.getVehicle("BMW").getMileage());
        try {
            System.out.println(factoryLux.getVehicle("TATA").getMileage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

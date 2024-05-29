package design_patterns.creational.abstract_factory_pattern.ex2;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String company) {
        if (company.equalsIgnoreCase("AUDI")) {
            return new AUDIVehicle();
        } else if (company.equalsIgnoreCase("BMW")) {
            return new BMWVehicle();
        } else {
            throw new IllegalArgumentException("No such vehicle company exists.");
        }
    }
}

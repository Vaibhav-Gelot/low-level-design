package design_patterns.creational.abstract_factory_pattern.ex2;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String company) {
        if (company.equalsIgnoreCase("TATA")) {
            return new TATAVehicle();
        } else if (company.equalsIgnoreCase("MAHINDRA")) {
            return new MAHINDRAVehicle();
        } else {
            throw new IllegalArgumentException("No such company vehicle exists.");
        }
    }
}

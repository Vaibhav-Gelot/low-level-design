package design_patterns.creational.prototype_pattern.ex_2;

public class Vehicle implements ProtoType {
    private String name;
    private String color;
    private int price;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
        this.price = (int) (Math.random() * (25 - 18 + 1)) + 18;
    }

    public static void changeColor(Vehicle obj, String color) {
        obj.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public ProtoType clone() {
        return new Vehicle(name, color);
    }
}

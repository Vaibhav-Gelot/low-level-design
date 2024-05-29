package design_patterns.structural.decorator_pattern.ex1.pizza;

public class FarmHouse implements BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}

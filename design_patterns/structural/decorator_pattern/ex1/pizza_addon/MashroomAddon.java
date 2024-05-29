package design_patterns.structural.decorator_pattern.ex1.pizza_addon;

import design_patterns.structural.decorator_pattern.ex1.pizza.BasePizza;

public class MashroomAddon implements PizzaAddon {

    private BasePizza basePizza;

    public MashroomAddon(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }

}
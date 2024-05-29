package design_patterns.structural.decorator_pattern.ex1.pizza_addon;

import design_patterns.structural.decorator_pattern.ex1.pizza.BasePizza;

public class ExtraCheeseAddon implements PizzaAddon {
    private BasePizza basePizza;

    public ExtraCheeseAddon(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}

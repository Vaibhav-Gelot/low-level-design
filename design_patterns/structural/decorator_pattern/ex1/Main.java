package design_patterns.structural.decorator_pattern.ex1;

import design_patterns.structural.decorator_pattern.ex1.pizza.BasePizza;
import design_patterns.structural.decorator_pattern.ex1.pizza.MargheritaPizza;
import design_patterns.structural.decorator_pattern.ex1.pizza_addon.ExtraCheeseAddon;
import design_patterns.structural.decorator_pattern.ex1.pizza_addon.MashroomAddon;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new MashroomAddon(new ExtraCheeseAddon(new MargheritaPizza()));
        System.out.println("Pizza Prize : " + basePizza.cost());

    }

}

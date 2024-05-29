package design_patterns.creational.abstract_factory_pattern.ex1.plan.jio;

import design_patterns.creational.abstract_factory_pattern.ex1.plan.MobileCellularPlan;

public class JioMobileCellularPlan extends MobileCellularPlan {
    @Override
    public double getRate() {
        return rate = 2.5;
    }
}

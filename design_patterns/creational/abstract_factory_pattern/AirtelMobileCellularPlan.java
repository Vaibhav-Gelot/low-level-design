package design_patterns.creational.abstract_factory_pattern;

import design_patterns.creational.abstract_factory_pattern.ex1.plan.MobileCellularPlan;

public class AirtelMobileCellularPlan extends MobileCellularPlan {
    @Override
    public double getRate() {
        return rate = 2.55;
    }
}

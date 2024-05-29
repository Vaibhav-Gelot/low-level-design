package design_patterns.creational.abstract_factory_pattern;

import design_patterns.creational.abstract_factory_pattern.ex1.plan.MobileDataPlan;

public class AirtelMobileDataPlan extends MobileDataPlan {
    @Override
    public double getRate() {
        return rate = 1.55;
    }
}

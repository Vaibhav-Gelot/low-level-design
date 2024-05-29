package design_patterns.creational.abstract_factory_pattern.ex1.plan.jio;

import design_patterns.creational.abstract_factory_pattern.ex1.plan.MobileDataPlan;

public class JioMobileDataPlan extends MobileDataPlan {
    @Override
    public double getRate() {
        return rate = 1.50;
    }
}

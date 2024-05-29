package design_patterns.creational.abstract_factory_pattern.ex1;

import design_patterns.creational.abstract_factory_pattern.AirtelMobileDataPlan;
import design_patterns.creational.abstract_factory_pattern.ex1.plan.MobileDataPlan;
import design_patterns.creational.abstract_factory_pattern.ex1.plan.jio.JioMobileDataPlan;

public class MobileDataPlanFactory extends MobilePlanFactory {
    @Override
    public String getOperatorName(String type) {
        if (type.equalsIgnoreCase("JIO")) {
            return "JIO";
        } else if (type.equalsIgnoreCase("AIRTEL")) {
            return "AIRTEL";
        } else {
            return null;
        }
    }

    public MobileDataPlan selectDataPlanOperator(String OperatorType) {
        if (OperatorType == "JIO") {
            return new JioMobileDataPlan();
        } else if (OperatorType == "AIRTEL") {
            return new AirtelMobileDataPlan();
        } else {
            return null;
        }
    }
}

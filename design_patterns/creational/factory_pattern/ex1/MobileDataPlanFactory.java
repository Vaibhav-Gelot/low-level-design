package design_patterns.creational.factory_pattern.ex1;

public class MobileDataPlanFactory {
    public MobileDataPlan getPlan(String OperatorType) {
        if (OperatorType == "JIO") {
            return new JioMobileDataPlan();
        } else if (OperatorType == "AIRTEL") {
            return new AirtelMobileDataPlan();
        } else {
            return null;
        }
    }
}

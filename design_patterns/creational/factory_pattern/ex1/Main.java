package design_patterns.creational.factory_pattern.ex1;

public class Main {
    public static void main(String[] args) {
        MobileDataPlanFactory planFactory = new MobileDataPlanFactory();
        MobileDataPlan planA = planFactory.getPlan("JIO");
        System.out.println("JIO : " + planA.getRate() + " : " + planA.getBill(60));
        MobileDataPlan planB = planFactory.getPlan("AIRTEL");
        System.out.println("AIRTEL : " + planB.getRate() + " : " + planB.getBill(60));
    }
}

package design_patterns.creational.factory_pattern.ex1;

abstract class MobileDataPlan {
    protected double rate;

    abstract public double getRate();

    public double getBill(int minutes) {
        return rate * minutes;
    }
}
package design_patterns.creational.abstract_factory_pattern.ex1.plan;

abstract class MobilePlan {
    protected double rate;

    abstract public double getRate();

    public double getBill(int minutes) {
        return rate * minutes;
    }
}

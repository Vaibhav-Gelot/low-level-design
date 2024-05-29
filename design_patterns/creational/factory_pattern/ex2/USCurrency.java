package design_patterns.creational.factory_pattern.ex2;

public class USCurrency implements Currency{
    @Override
    public String getSymbol() {
        return "USD";
    }
}

package design_patterns.creational.factory_pattern.ex2;

public class CurrencyFactory {

    public Currency selectCurrency(String country) {
        if (country.equalsIgnoreCase("INDIA")) {
            return new INDCurrency();
        } else if (country.equalsIgnoreCase("USA")) {
            return new USCurrency();
        } else if (country.equalsIgnoreCase("SINGAPORE")) {
            return new SGDCurrency();
        } else {
            throw new IllegalArgumentException("No such country exists.");
        }
    }
}

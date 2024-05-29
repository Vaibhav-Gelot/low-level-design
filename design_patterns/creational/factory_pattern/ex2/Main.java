package design_patterns.creational.factory_pattern.ex2;

public class Main {
    public static void main(String[] args) {
        CurrencyFactory factory = new CurrencyFactory();
        System.out.println(factory.selectCurrency("INDIA").getSymbol());
        System.out.println(factory.selectCurrency("USA").getSymbol());
        System.out.println(factory.selectCurrency("SINGAPORE").getSymbol());
        try {
            System.out.println(factory.selectCurrency("CANADA").getSymbol());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package design_patterns.creational.singleton_pattern.ex_1;

public class Singleton {
    private static volatile Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton Instance() {
        return instance;
    }
}

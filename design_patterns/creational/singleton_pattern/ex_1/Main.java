package design_patterns.creational.singleton_pattern.ex_1;

public class Main {
    public static void main(String[] args) {
        Singleton object = Singleton.Instance();
        System.out.println(object);
        Singleton object2 = Singleton.Instance();
        System.out.println(object2);
    }
}

package design_patterns.creational.singleton_pattern.ex_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(EagerDBConnection.getEAGERDBConnection());
        System.out.println(LazyDBConnection.getLazyDBConnection());
        System.out.println(SynchronizedDBConnection.getConnInstance());
        System.out.println(DoubleLockDBConnection.getConnInstance());
    }
}

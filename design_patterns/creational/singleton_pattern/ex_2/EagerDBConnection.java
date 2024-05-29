package design_patterns.creational.singleton_pattern.ex_2;

public class EagerDBConnection {
    private static final EagerDBConnection connInstance = new EagerDBConnection();

    private EagerDBConnection() {
//        System.out.println("Con : Eager DB Conn");
    }

    public static EagerDBConnection getEAGERDBConnection() {
        return connInstance;
    }

    @Override
    public String toString() {
        return "Eager DB Conn";
    }
}

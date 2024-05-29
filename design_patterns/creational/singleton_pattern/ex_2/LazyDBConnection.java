package design_patterns.creational.singleton_pattern.ex_2;

public class LazyDBConnection {
    private static LazyDBConnection connInstance;

    private LazyDBConnection() {
        System.out.println("Lazy DB Conn");
    }

    public static LazyDBConnection getLazyDBConnection() {
        if (connInstance == null) {
            connInstance = new LazyDBConnection();
        }
        return connInstance;
    }
}
//Not Thread Safe;
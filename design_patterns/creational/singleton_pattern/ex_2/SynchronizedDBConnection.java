package design_patterns.creational.singleton_pattern.ex_2;

public class SynchronizedDBConnection {
    private static SynchronizedDBConnection connInstance;

    private SynchronizedDBConnection() {
        System.out.println("Synchronized DB Conn");
    }

    public static synchronized SynchronizedDBConnection getConnInstance() {
        if (connInstance == null) {
            connInstance = new SynchronizedDBConnection();
        }
        return connInstance;
    }
}

//If too many request then it will make too many lock/ expensive
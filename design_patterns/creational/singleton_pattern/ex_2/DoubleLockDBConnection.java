package design_patterns.creational.singleton_pattern.ex_2;

public class DoubleLockDBConnection {
    private static DoubleLockDBConnection connInstance;

    private DoubleLockDBConnection() {
        System.out.println("Double Lock DB Conn");
    }

    ;

    public static DoubleLockDBConnection getConnInstance() {
        if (connInstance == null) {
            synchronized (DoubleLockDBConnection.class) {
                if (connInstance == null) {
                    return new DoubleLockDBConnection();
                }
            }
        }
        return connInstance;
    }
}

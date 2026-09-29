class DatabaseConnection {

    void initialize() {
        System.out.println("Database connection initialized");
    }

    void execute() {
        System.out.println("Executing database operation");
    }

    void close() {
        System.out.println("Database connection closed");
    }
}

public class BeanLifecycle {

    public static void main(String[] args) {

        DatabaseConnection db = new DatabaseConnection();

        db.initialize();
        db.execute();
        db.close();
    }
}
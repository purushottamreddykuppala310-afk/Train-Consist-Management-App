import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC2 {

    // Step 1: Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Step 2: Passenger Bogie class with validation
    static class PassengerBogie {
        String bogieId;
        String type;
        int capacity;

        public PassengerBogie(String bogieId, String type, int capacity)
                throws InvalidCapacityException {

            // Validation (Fail-Fast)
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.bogieId = bogieId;
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new PassengerBogie("P1", "Sleeper", 72));
            bogies.add(new PassengerBogie("P2", "AC Chair", 60));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("P3", "First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display successfully created bogies
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}
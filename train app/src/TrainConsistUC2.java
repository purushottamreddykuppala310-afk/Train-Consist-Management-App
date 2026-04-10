import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC2 {

    // Inner Bogie class
    static class Bogie {
        String bogieId;
        String type;
        int capacity;

        public Bogie(String bogieId, String type, int capacity) {
            this.bogieId = bogieId;
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse from UC7–UC9)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", "Sleeper", 72));
        bogies.add(new Bogie("B2", "AC Chair", 60));
        bogies.add(new Bogie("B3", "Sleeper", 75));
        bogies.add(new Bogie("B4", "First Class", 40));
        bogies.add(new Bogie("B5", "AC Chair", 65));

        // Step 2: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())        // extract capacity
                .reduce(0, Integer::sum);        // aggregate sum

        // Step 3: Display total seats
        System.out.println("Total Seating Capacity of Train: " + totalCapacity);
    }
}
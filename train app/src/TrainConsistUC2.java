import java.util.*;
import java.util.stream.Collectors;

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

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse concept from UC7/UC8)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", "Sleeper", 72));
        bogies.add(new Bogie("B2", "AC Chair", 60));
        bogies.add(new Bogie("B3", "Sleeper", 75));
        bogies.add(new Bogie("B4", "First Class", 40));
        bogies.add(new Bogie("B5", "AC Chair", 65));

        // Step 2: Convert to stream & group by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.getType()));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        groupedBogies.forEach((type, list) -> {
            System.out.println("Type: " + type);
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistUC2 {

    // Inner Bogie class
    static class Bogie {
        String bogieId;
        int capacity;

        public Bogie(String bogieId, int capacity) {
            this.bogieId = bogieId;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId + ", Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create bogie list (UC7 reuse)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", 50));
        bogies.add(new Bogie("B2", 75));
        bogies.add(new Bogie("B3", 65));
        bogies.add(new Bogie("B4", 40));
        bogies.add(new Bogie("B5", 80));

        // Step 2: Apply Stream filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Step 3: Display result
        System.out.println("Filtered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}
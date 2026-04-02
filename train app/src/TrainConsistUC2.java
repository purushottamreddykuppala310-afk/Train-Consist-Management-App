import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC2 {

    public static void main(String[] args) {
        // 1️⃣ Welcome message
        System.out.println("=== Train Consist Capacity Mapping App (UC6) ===");

        // 2️⃣ Initialize HashMap to store bogie -> capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 3️⃣ Insert bogies and capacities
        bogieCapacityMap.put("Sleeper", 72);       // 72 seats
        bogieCapacityMap.put("AC Chair", 108);     // 108 seats
        bogieCapacityMap.put("First Class", 54);   // 54 seats
        bogieCapacityMap.put("Cargo", 2000);       // 2000 kg load
        bogieCapacityMap.put("Guard", 2);          // 2 personnel

        // 4️⃣ Iterate and display bogie capacities
        System.out.println("Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Program continues
        System.out.println("Capacity mapping completed successfully.");
    }
}
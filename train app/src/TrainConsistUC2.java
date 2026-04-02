import java.util.HashSet;
import java.util.Set;

public class TrainConsistUC2 {

    public static void main(String[] args) {
        // 1️⃣ Welcome message
        System.out.println("=== Train Consist Management App (UC3) ===");

        // 2️⃣ Initialize a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // 3️⃣ Add bogie IDs (with intentional duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // 4️⃣ Display the final set of unique bogie IDs
        System.out.println("Unique bogie IDs in train consist: " + bogieIDs);

        // Program continues
        System.out.println("Bogie ID tracking completed. Duplicates automatically removed.");
    }
}
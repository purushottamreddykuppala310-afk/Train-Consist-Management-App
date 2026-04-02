import java.util.ArrayList;
import java.util.List;

// ==========================
// TRAIN CONSIST MANAGEMENT APP
// ==========================
public class trainapp {

    public static void main(String[] args) {
        // 1️⃣ Welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2️⃣ Initialize train consist (empty list of bogies)
        List<String> trainConsist = new ArrayList<>();

        // 3️⃣ Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // 4️⃣ Program continues...
        System.out.println("Train consist initialized. Ready to add bogies.");
    }
}
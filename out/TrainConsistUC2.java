import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC2 {

    public static void main(String[] args) {
        // 1️⃣ Welcome message
        System.out.println("=== Train Consist Management App (UC2) ===");

        // 2️⃣ Initialize passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // 3️⃣ Add bogies dynamically
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 4️⃣ Display list after insertion
        System.out.println("Bogies after insertion: " + passengerBogies);

        // 5️⃣ Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Bogies after removing AC Chair: " + passengerBogies);

        // 6️⃣ Check existence of a bogie (Sleeper)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // 7️⃣ Final list state
        System.out.println("Final bogie list: " + passengerBogies);

        // Program continues
        System.out.println("Train consist operations completed.");
    }
}
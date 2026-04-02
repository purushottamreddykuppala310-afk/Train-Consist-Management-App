import java.util.LinkedList;

public class TrainConsistUC2 {

    public static void main(String[] args) {
        // 1️⃣ Welcome message
        System.out.println("=== Train Consist Management App (UC4) ===");

        // 2️⃣ Initialize a LinkedList for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 3️⃣ Add bogies in order
        trainConsist.add("Engine");    // Locomotive
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");     // Guard Coach

        System.out.println("Train consist after adding bogies: " + trainConsist);

        // 4️⃣ Insert a Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        // 5️⃣ Remove first and last bogies
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard
        System.out.println("After removing first and last bogies: " + trainConsist);

        // 6️⃣ Display final ordered consist
        System.out.println("Final ordered train consist: " + trainConsist);

        // Program continues
        System.out.println("Train consist operations completed with LinkedList.");
    }
}
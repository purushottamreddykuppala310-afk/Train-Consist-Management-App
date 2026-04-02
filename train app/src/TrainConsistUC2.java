import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistUC2 {

    public static void main(String[] args) {
        // 1️⃣ Welcome message
        System.out.println("=== Train Consist Management App (UC5) ===");

        // 2️⃣ Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 3️⃣ Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 4️⃣ Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, ignored automatically

        // 5️⃣ Display final train formation
        System.out.println("Final train formation (duplicates ignored, order preserved):");
        System.out.println(trainFormation);

        // Program continues
        System.out.println("Train consist safely modeled with LinkedHashSet.");
    }
}
import java.util.Arrays;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        // Step 1: Bogie type names (unsorted input)
        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display before sorting
        System.out.println("Before Sorting: " + Arrays.toString(bogieTypes));

        // Step 2: Built-in sorting (no manual logic)
        Arrays.sort(bogieTypes);

        // Step 3: Display sorted result
        System.out.println("After Sorting: " + Arrays.toString(bogieTypes));
    }
}
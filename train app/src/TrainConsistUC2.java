import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        // Step 1: Bogie IDs (can be unsorted as well)
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Step 2: Ensure sorting (Binary Search requirement)
        Arrays.sort(bogieIds);

        // Step 3: Binary Search setup
        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        // Step 4: Binary Search loop
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("Bogie Found at index: " + mid);
                found = true;
                break;
            }
            else if (comparison > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Step 5: Result output
        if (!found) {
            System.out.println("Bogie NOT Found");
        }

        scanner.close();
    }
}
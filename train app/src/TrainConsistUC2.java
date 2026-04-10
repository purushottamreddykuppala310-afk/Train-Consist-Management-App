import java.util.Scanner;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        // Step 1: Bogie ID list (you can make it empty to test exception)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Step 2: Fail-fast validation
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Search operation not allowed.");
        }

        // Step 3: Linear Search after validation
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Step 4: Output result
        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie NOT Found");
        }

        scanner.close();
    }
}
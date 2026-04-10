import java.util.Scanner;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        // Step 1: Array of Bogie IDs (unsorted data)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        Scanner scanner = new Scanner(System.in);

        // Step 2: Take input from user
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie Found at index: " + i);
                found = true;
                break; // early termination
            }
        }

        // Step 4: Result display
        if (!found) {
            System.out.println("Bogie NOT Found");
        }

        scanner.close();
    }
}
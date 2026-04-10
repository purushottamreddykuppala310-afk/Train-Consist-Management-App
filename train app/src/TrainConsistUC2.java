import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC2 {

    // Step 1: Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Step 2: Goods Bogie class
    static class GoodsBogie {
        String bogieId;
        String shape;   // Cylindrical / Rectangular
        String cargo;

        public GoodsBogie(String bogieId, String shape) {
            this.bogieId = bogieId;
            this.shape = shape;
        }

        // Step 3: Cargo assignment with safety validation
        public void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // If valid → assign cargo
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully to " + bogieId);

            } catch (CargoSafetyException e) {
                // Handle exception gracefully
                System.out.println("Error: " + e.getMessage());

            } finally {
                // Always executes
                System.out.println("Assignment attempt completed for " + bogieId + "\n");
            }
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId +
                    ", Shape: " + shape +
                    ", Cargo: " + (cargo == null ? "Not Assigned" : cargo);
        }
    }

    public static void main(String[] args) {

        // Step 4: Create bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("G1", "Cylindrical"));
        bogies.add(new GoodsBogie("G2", "Rectangular"));

        // Step 5: Assign cargo (safe + unsafe cases)
        bogies.get(0).assignCargo("Petroleum"); // Valid
        bogies.get(1).assignCargo("Petroleum"); // Invalid

        // Step 6: Program continues
        System.out.println("Final Bogie Status:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }
    }
}
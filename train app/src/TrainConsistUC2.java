import java.util.ArrayList;
import java.util.List;

public class TrainConsistUC2 {

    // Inner Goods Bogie class
    static class GoodsBogie {
        String bogieId;
        String type;   // Cylindrical, Open, Box
        String cargo;  // Petroleum, Coal, Grain

        public GoodsBogie(String bogieId, String type, String cargo) {
            this.bogieId = bogieId;
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId + ", Type: " + type + ", Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("G1", "Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("G2", "Open", "Coal"));
        bogies.add(new GoodsBogie("G3", "Box", "Grain"));
        bogies.add(new GoodsBogie("G4", "Cylindrical", "Petroleum"));

        // Step 2: Apply safety validation using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum allowed
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}
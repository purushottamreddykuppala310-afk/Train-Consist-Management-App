import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistUC2 {

    // Inner Bogie class
    static class Bogie {
        String bogieId;
        int capacity;

        public Bogie(String bogieId, int capacity) {
            this.bogieId = bogieId;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create large dataset for testing
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("B" + i, (i % 100) + 1));
        }

        // -------------------------------
        // LOOP-BASED FILTERING
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // STREAM-BASED FILTERING
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // DISPLAY RESULTS
        // -------------------------------
        System.out.println("Loop Execution Time (nanoseconds): " + loopTime);
        System.out.println("Stream Execution Time (nanoseconds): " + streamTime);

        // Optional comparison
        if (loopTime < streamTime) {
            System.out.println("Loop is faster in this run.");
        } else if (streamTime < loopTime) {
            System.out.println("Stream is faster in this run.");
        } else {
            System.out.println("Both have similar performance.");
        }
    }
}
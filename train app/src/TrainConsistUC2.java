import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

// ===============================
// MAIN CLASS (Binary Search Logic)
// ===============================
class TrainConsistManagement {

    public boolean binarySearch(String[] bogies, String key) {

        // Empty array handling
        if (bogies == null || bogies.length == 0) {
            return false;
        }

        // Sort before searching (required for binary search)
        Arrays.sort(bogies);

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogies[mid]);

            if (result == 0) {
                return true;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}

// ===============================
// TEST CLASS (JUnit Test Cases)
// ===============================
public class QuantityMeasurementAppTest {

    TrainConsistManagement obj = new TrainConsistManagement();

    @Test
    public void testBinarySearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(obj.binarySearch(bogies, "BG309"));
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(obj.binarySearch(bogies, "BG999"));
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(obj.binarySearch(bogies, "BG101"));
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(obj.binarySearch(bogies, "BG550"));
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(obj.binarySearch(bogies, "BG101"));
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        String[] bogies = {};
        assertFalse(obj.binarySearch(bogies, "BG101"));
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(obj.binarySearch(bogies, "BG205"));
    }
}

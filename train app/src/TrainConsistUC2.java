import org.junit.Test;
import static org.junit.Assert.*;

// ===============================
// MAIN CLASS (Linear Search Logic)
// ===============================
class TrainConsistManagement {

    public boolean searchBogie(String[] bogies, String key) {

        // Traverse array sequentially
        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}

// ===============================
// TEST CLASS (UC18 Test Cases)
// ===============================
public class QuantityMeasurementAppTest {

    TrainConsistManagement obj = new TrainConsistManagement();

    @Test
    public void testSearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(obj.searchBogie(bogies, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(obj.searchBogie(bogies, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(obj.searchBogie(bogies, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(obj.searchBogie(bogies, "BG550"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(obj.searchBogie(bogies, "BG101"));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {

    // Helper method (simulate search logic)
    public boolean searchBogie(String[] bogies, String key) {

        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available in the train");
        }

        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            searchBogie(bogies, "BG101");
        });

        assertEquals("No bogies available in the train", exception.getMessage());
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101", "BG205"};

        boolean result = searchBogie(bogies, "BG101");

        assertTrue(result);
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101", "BG205", "BG309"};

        boolean result = searchBogie(bogies, "BG205");

        assertTrue(result);
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101", "BG205", "BG309"};

        boolean result = searchBogie(bogies, "BG999");

        assertFalse(result);
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};

        boolean result = searchBogie(bogies, "BG101");

        assertTrue(result);
    }
}

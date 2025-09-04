import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DegreeTest {
    private final DegreeCalculator calculator = new DegreeCalculator();
    @Test
    void TestDegrees() {
        assertEquals(4, calculator.yearsToCompleteDegree("bsc"));
        assertEquals(6, calculator.yearsToCompleteDegree("phd"));
        assertEquals(9, calculator.yearsToCompleteDegree("msc"));
        assertEquals(0, calculator.yearsToCompleteDegree("amk"));
        assertEquals(0, calculator.yearsToCompleteDegree("SLDFKPOUY35096IK3"));
        assertEquals(0, calculator.yearsToCompleteDegree("-685"));
    }

    @Test
    void TestNames() {
        assertEquals("PhD", calculator.degreeName("phd"));
        assertEquals("MSc", calculator.degreeName("msc"));
        assertEquals("Invalid degree name.", calculator.degreeName("amk"));
    }

    @Test
    void TestExceptions() {
        assertThrows(NullPointerException.class, () -> {
            calculator.yearsToCompleteDegree(null);
        });
        assertThrows(NullPointerException.class, () -> {
            calculator.degreeName(null);
        });
    }
}

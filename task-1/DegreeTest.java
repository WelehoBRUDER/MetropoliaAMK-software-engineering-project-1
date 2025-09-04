import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

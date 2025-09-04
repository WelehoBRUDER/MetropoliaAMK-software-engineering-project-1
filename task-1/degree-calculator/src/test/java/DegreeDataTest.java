import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeDataTest {
    private final DegreeData testData = new DegreeData("test", 10);

    @Test
    void getName() {
        assertEquals("test", testData.getName());
    }

    @Test
    void getYears() {
        assertEquals(10, testData.getYears());
    }
}
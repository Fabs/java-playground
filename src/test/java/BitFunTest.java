import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitFunTest {
    @Test
    void verifyShiftingAssumptions() {
        assertEquals(1, 2 >> 1);
        assertEquals(4, 2 << 1);
    }

    @Test
    void verifyFormatAssumptions() {
        assertEquals("1010",
            Integer.toBinaryString(10));
        assertEquals("1111",
            Integer.toBinaryString((1000 ^ (1000 - 1))));
    }
}

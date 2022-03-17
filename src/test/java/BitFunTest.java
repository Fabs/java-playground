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
//        assertEquals("10",
//            Integer.toBinaryString(10));
        assertEquals(Integer.toBinaryString((10 ^ (10 - 1))),
            Integer.toBinaryString(-10));
    }
}

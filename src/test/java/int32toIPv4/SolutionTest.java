package int32toIPv4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution() {
        assertEquals("128.32.10.1", Solution.longToIP(2149583361L));
    }

}
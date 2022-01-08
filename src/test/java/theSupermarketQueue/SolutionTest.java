package theSupermarketQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution() {
        assertEquals(10, Solution.solveSuperMarketQueue(new int[] {10, 2, 3, 3}, 2));
    }

}
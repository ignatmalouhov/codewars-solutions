package scramblies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution1() {
        assertTrue(Solution.scramble("rkqodlw", "world"));
    }

    @Test
    void testSolution2() {
        assertTrue(Solution.scramble("cedewaraaossoqqyt", "codewars"));
    }

    @Test
    void testSolution3() {
        assertFalse(Solution.scramble("katas", "steak"));
    }

    @Test
    void testSolution4() {
        assertFalse(Solution.scramble("scriptjavx", "javascript"));}

    @Test
    void testSolution5() {
        assertTrue(Solution.scramble("scriptingjava", "javascript"));
    }

    @Test
    void testSolution6() {
        assertTrue(Solution.scramble("scriptsjava", "javascripts"));
    }

    @Test
    void testSolution7() {
        assertFalse(Solution.scramble("javscripts", "javascript"));
    }

    @Test
    void testSolution8() {
        assertTrue(Solution.scramble("aabbcamaomsccdd", "commas"));
    }

    @Test
    void testSolution9() {
        assertTrue(Solution.scramble("commas", "commas"));
    }

    @Test
    void testSolution() {
        assertTrue(Solution.scramble("sammoc", "commas"));
    }
}
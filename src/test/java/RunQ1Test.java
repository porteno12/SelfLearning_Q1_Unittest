import org.example.RunQ1;
import org.example.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunQ1Test {

    @Test
    public void testAllDigitsAppearBidirectionally() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(23);
        queue.insert(32);
        queue.insert(45);
        queue.insert(54);
        queue.insert(67);
        queue.insert(76);

        assertTrue(RunQ1.q1(queue), "The function should return true for a valid bidirectional queue.");
    }

    @Test
    public void testMissingReverseDigit() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(23);
        queue.insert(45);
        queue.insert(54);
        queue.insert(67);
        queue.insert(76);

        assertFalse(RunQ1.q1(queue), "The function should return false when a digit lacks a reverse.");
    }

    @Test
    public void testEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        assertFalse(RunQ1.q1(queue), "An empty queue should return false.");
    }

    @Test
    public void testSingleElementQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(23);

        assertFalse(RunQ1.q1(queue), "A single element cannot form a bidirectional match.");
    }

    @Test
    public void testNonTwoDigitNumbers() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(5);  // חד-ספרתי
        queue.insert(23);
        queue.insert(32);
        queue.insert(101);  // תלת-ספרתי

        assertFalse(RunQ1.q1(queue), "A queue with non-two-digit numbers should return false.");
    }
}

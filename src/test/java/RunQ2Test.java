import org.example.RunQ2;
import org.example.Utils.Item;
import org.example.Utils.MyUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Queue;

public class RunQ2Test {

    @Test
    public void testGetSubSequenceLength_ValidSubsequence() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(17);
        queue.insert(-5);
        queue.insert(8);
        queue.insert(2);
        queue.insert(6);
        queue.insert(10);
        queue.insert(1);
        queue.insert(-10);
        queue.insert(5);
        queue.insert(-2);
        queue.insert(-8);
        queue.insert(22);
        queue.insert(16);
        queue.insert(-1);
        queue.insert(23);

        assertEquals(7, RunQ2.q2A(queue, 8), "Expected length 7 but got different result.");
    }

    @Test
    public void testGetSubSequenceLength_InvalidSubsequence() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(17);
        queue.insert(-5);
        queue.insert(8);
        queue.insert(2);
        queue.insert(6);

        assertEquals(-1, RunQ2.q2A(queue, 7), "Expected -1 but got different result.");
    }

    @Test
    public void testGetSubSequences() {
        Queue<Integer> queue = new Queue<>();
        queue.insert(17);
        queue.insert(-5);
        queue.insert(8);
        queue.insert(2);
        queue.insert(6);
        queue.insert(10);
        queue.insert(1);
        queue.insert(-10);
        queue.insert(5);
        queue.insert(-2);
        queue.insert(-8);
        queue.insert(22);
        queue.insert(16);
        queue.insert(-1);
        queue.insert(23);

        Queue<RunQ2.Item> result = RunQ2.q2B(queue);
        Queue<Item> expected = new Queue<>();
        expected.insert(new Item(8, 7));
        expected.insert(new Item(22, 1));
        expected.insert(new Item(5, 1));

        assertEquals(expected.toString(), result.toString(), "Subsequence queue does not match expected.");
    }
}

package misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SkipIteratorTest {

    @Test // 1 point
    void testSingleReturnValue() {
        Integer[] vals = {1, 2};
        Integer[] expected = {1};
        List<Integer> iteratorValues = new ArrayList<>();

        SkipIterator<Integer> myIterator = new SkipIterator<Integer>(vals);
        while(myIterator.hasNext()) {
            iteratorValues.add(myIterator.next());
        }
        Integer[] returned = iteratorValues.toArray(new Integer[0]);
        assertTrue(Arrays.equals(expected, returned));

    }
}
package lists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class SolutionsTest {
    /*
        Tests for Q1
     */
    @Test // 1 point
    public void testNoNest() {
        List<NestedObject> nestedList = new ArrayList<>();
        int[] values = {1, 5, 12, 4};
        NestedObject no;
        for (int v : values) {
            no = new NestedObject(v);
            nestedList.add(no);
        }
        // [1, 5, 12, 4]
        assertEquals(22, Solutions.nestedSum(nestedList));
    }

    @Test // 2 point
    public void testOnlyNest() {
        NestedObject no1 = new NestedObject();
        NestedObject no2 = new NestedObject();

        int[] firstNest = {1, 2, 3};
        int[] secondNest = {5, -3, 4};
        for (int i : firstNest) {
            NestedObject child = new NestedObject(i);
            no1.addNestedElement(child);
        }

        for (int i : secondNest) {
            NestedObject child = new NestedObject(i);
            no2.addNestedElement(child);
        }

        // nestedList represents [[1, 2, 3], [5, -3, 4]]
        List<NestedObject> nestedList = new ArrayList<>();
        nestedList.add(no1);
        nestedList.add(no2);
        assertEquals(24, Solutions.nestedSum(nestedList));
    }

    @Test // 2 points
    public void testMixNest() {
        List<NestedObject> nestedList = new ArrayList<>();
        for (int idx = 1; idx <= 5; idx++) {
            NestedObject no = new NestedObject(idx * 2);
            nestedList.add(no);
        }

        int[] nest = {4, 3, 1};
        NestedObject subList = new NestedObject();
        for (int n : nest) {
            NestedObject no = new NestedObject(n);
            subList.addNestedElement(no);
        }
        nestedList.set(3, subList);

        // nestedList = [2, 4, 6, [4, 3, 1], 10]
        assertEquals(38, Solutions.nestedSum(nestedList));
    }


    /*
        Q9 Tests
     */

    @Test // 1 point
    void testSimplePath() {
        int[][] treasureMap = {{2, 3, 2},
                               {2, 1, 4},
                               {1, 1, 1}};
        assertTrue(Solutions.getMaxTreasure(treasureMap) == 12);
    }

    @Test // 1 point
    void testSimplePathV2() {
        int[][] treasureMap = {{2, -3, 2},
                               {-2, 1, -4},
                               {1, 1, 1}};
        assertTrue(Solutions.getMaxTreasure(treasureMap) == 5);
    }

    @Test // 2 points
    void testWithNegative() {
        int[][] treasureMap = {{-2, -3, -5, 0},
                               {-4,  -2, -10, 14},
                               {1,  -1,  1, 0},
                               {1,   1,  1, 1}};
        assertTrue(Solutions.getMaxTreasure(treasureMap) == 5);
    }

    /*
        Q11 Tests
     */
    @Test // 1 point
    void testMergeEvenLists(){
        List<List<Integer>> allLists = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        int numLists = 4;
        Random r = new Random();

        for(int i = 0; i < numLists; i ++){
            List<Integer> singleList = new ArrayList<>();
            int listLen = r.nextInt(5, 10);
            for(int j = 0; j < listLen; j ++){
                int number = r.nextInt(0, 1000);
                singleList.add(number);
                expected.add(number);
            }
            Collections.sort(singleList);
            allLists.add(singleList);
        }
        Collections.sort(expected);
        List<Integer> output = Solutions.mergeAll(allLists);
        assertTrue(expected.equals(output));
    }
}
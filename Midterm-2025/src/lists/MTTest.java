package lists;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MTTest {

    // Q1 Tests
    @Test //1 point
    void testNoRotations() {
        int[] values = {56, 45, 33, 19, 12, 22, 0};
        int[] expected = {56, 45, 33, 19, 12, 22, 0};
        int[] results = MT.rotateLeft(values, 0);
        assertTrue(Arrays.equals(expected, results));
    }

    @Test // 1 point
    void testIncrementalRotations() {
        int[] values = {56, 45, 33, 19, 12, 22, 0};
        int[] expected = {33, 19, 12, 22, 0, 56, 45};
        int[] results = MT.rotateLeft(values, 2);
        int[] r1 = MT.rotateLeft(values, 1);
        int[] r2 = MT.rotateLeft(r1, 1);

        assertTrue(Arrays.equals(r2, expected));
        assertTrue(Arrays.equals(expected, results));
    }

    // Q2 Tests
    @Test // 1 points
    void testNoMerge() {
        int[][] board = {{-1, -1, -1, -1},
                {-1,  4,  2,  -1},
                {-1,  8,  4, 2}};

        int[][] expected = {{-1,  4,   2,   2},
                {-1,  8,   4,  -1},
                {-1,  -1, -1,  -1}};
        MT.tilt(board);
        assertTrue(Arrays.deepEquals(board, expected));
    }

    @Test // 2 point
    void testSingleMerge() {
        int[][] board = {{-1, -1,  4,  8},
                {2,   4,  4,  2},
                {2,   8,  2,  8},
                {-1,  8,  2,  2},
        };

        int[][] expected = {{ 4,    4,   8,  8},
                {-1,   16,   4,  2},
                {-1,   -1,  -1,  8},
                {-1,   -1,  -1,  2},
        };
        MT.tilt(board);
        assertTrue(Arrays.deepEquals(board, expected));
    }

    @Test // 3 point
    void testLeadingMerge() {
        int[][] board = {{4,   4,  -1,  8},
                {4,   4,  -1,  2},
                {4,   -1,  4,  2},
                {-1,   4,  4,  2},

        };

        int[][] expected = {{8,   8,   8,  8},
                {4,   4,  -1,  4},
                {-1,  -1, -1,  2},
                {-1,  -1, -1, -1},

        };
        MT.tilt(board);
        assertTrue(Arrays.deepEquals(board, expected));
    }

    @Test // 3 point
    void testNoRecursiveMerge() {
        int[][] board = {{4,  2,  8},
                {2,  8, -1},
                {2,  4,  8},
                {-1, 4, 16},

        };

        int[][] expected = {{4,  2,  16},
                {4,  8,  16},
                {-1, 8,  -1},
                {-1, -1, -1},

        };
        MT.tilt(board);
        assertTrue(Arrays.deepEquals(board, expected));
    }

    //Q6 Tests
    @Test // 1 point
    void testSameLength() {
        int[][] vals = {{12, 56, 45, 19},
                        {1, 2, 3, 4}};

        int[] expected = {13, 58, 48, 23};

        List<DList<Integer>> allLists = new ArrayList();
        int numLists = vals.length;
        for(int rowIdx = 0; rowIdx < numLists; rowIdx ++) {
            int nCols = vals[rowIdx].length;
            DList<Integer> singleList = new DList();
            for(int nodeIdx = 0; nodeIdx < nCols; nodeIdx ++) {
                singleList.insertElement(nodeIdx, vals[rowIdx][nodeIdx]);
            }
            allLists.add(singleList);
        }

        DList<Integer> expectedList = new DList<>();
        for(int idx = 0; idx < expected.length; idx ++) {
            expectedList.insertElement(idx, expected[idx]);
        }

        DList<Integer> result = MT.elementSum(allLists);
        assertTrue(expectedList.equals(result));
    }

    @Test // 2 points
    void testDifferentLengths() {
        int[][] vals = {{12, 56, 45, 19},
                        {1, 2, 3, 4, 5, 6, 7}};

        int[] expected = {13, 58, 48, 23, 5, 6, 7};

        List<DList<Integer>> allLists = new ArrayList();
        int numLists = vals.length;
        for(int rowIdx = 0; rowIdx < numLists; rowIdx ++) {
            int nCols = vals[rowIdx].length;
            DList<Integer> singleList = new DList();
            for(int nodeIdx = 0; nodeIdx < nCols; nodeIdx ++) {
                singleList.insertElement(nodeIdx, vals[rowIdx][nodeIdx]);
            }
            allLists.add(singleList);
        }

        DList<Integer> expectedList = new DList<>();
        for(int idx = 0; idx < expected.length; idx ++) {
            expectedList.insertElement(idx, expected[idx]);
        }

        DList<Integer> result = MT.elementSum(allLists);
        assertTrue(expectedList.equals(result));
    }
}
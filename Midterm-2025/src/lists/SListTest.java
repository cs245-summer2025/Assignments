package lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SListTest {

    // Q3 Tests
    @Test // 1 point
    void testNoDuplicate(){
        int[] vals = {24, 25, 26, 27, 28};
        SList myList = new SList();
        SList expectedList = new SList();
        for(int i: vals) {
            myList.addFirst(i);
            expectedList.addFirst(i);
        }
        myList.duplicate(1);
        assertTrue(expectedList.equals(myList));
    }

    @Test // 2 point
    void testDuplicateTwice(){
        int[] vals = {24, 25, 26, 27, 28};
        int k = 2;

        SList myList = new SList();
        SList expectedList = new SList();
        for(int i: vals) {
            myList.addFirst(i);
        }
        for(int i: vals) {
            for(int j = 0; j < k; j ++) {
                expectedList.addFirst(i);
            }
        }
        myList.duplicate(k);
        assertTrue(expectedList.equals(myList));
    }

    //Q4 Tests
    @Test // 1 point
    void testNoCompress(){
        int[] numbersToAdd = {1, 2, 3, 4, 5, 6, 7, 8};

        SList numList = new SList();
        SList expected = new SList();
        for(int i: numbersToAdd) {
            numList.addFirst(i);
            expected.addFirst(i);
        }
        numList.compressNodes();
        assertTrue(expected.equals(numList));
    }

    @Test // 1.5 points
    void testCompressFront(){
        int[] numbersToAdd = {1, 2, 3, 4, 5, 8, 8, 8};
        int[] compressed = {1, 2, 3, 4, 5, 24};
        SList numList = new SList();
        SList expected = new SList();

        for(int i: numbersToAdd) {
            numList.addFirst(i);
        }

        for(int i: compressed) {
            expected.addFirst(i);
        }
        numList.compressNodes();
        assertTrue(expected.equals(numList));
    }

    @Test // 1.5 points
    void testCompressBack(){
        int[] numbersToAdd = {2, 2, 3, 4, 5, 6, 7, 8};
        int[] compressed = {4, 3, 4, 5, 6, 7, 8};
        SList numList = new SList();
        SList expected = new SList();

        for(int i: numbersToAdd) {
            numList.addFirst(i);
        }

        for(int i: compressed) {
            expected.addFirst(i);
        }

        numList.compressNodes();
        assertTrue(expected.equals(numList));
    }

    //Q5 Tests
    @Test // 1 point
    void testStepSizeOne() {
        SList<Integer> listToSlice = new SList<>();
        SList<Integer> expectedResult = new SList<>();
        int stepSize = 1;

        for(int i = 20; i > 0; i --) {
            listToSlice.addFirst(i);
        }

        for(int i = 8; i > 0; i -= stepSize) {
            expectedResult.addFirst(i);
        }
        SList<Integer> slicedList = listToSlice.slice(0, 8, stepSize);
        assertTrue(expectedResult.equals(slicedList));
    }

    @Test // 1 point
    void testSingleResult() {
        SList<Integer> listToSlice = new SList<>();
        SList<Integer> expectedResult = new SList<>();
        int stepSize = 6;

        for(int i = 20; i > 0; i --) {
            listToSlice.addFirst(i);
        }

        SList<Integer> slicedList = listToSlice.slice(5, 8, stepSize);
        expectedResult.addFirst(6);
        assertTrue(expectedResult.equals(slicedList));
    }

    @Test // 2 points
    void testMultiStepSizeV1() {
        SList<Integer> listToSlice = new SList<>();
        SList<Integer> expectedResult = new SList<>();
        int stepSize = 6;

        for(int i = 20; i > 0; i --) {
            listToSlice.addFirst(i);
        }

        for(int i = 12; i > 5; i -= stepSize) {
            expectedResult.addFirst(i);
        }
        SList<Integer> slicedList = listToSlice.slice(5, 17, stepSize);
        assertTrue(expectedResult.equals(slicedList));
    }

}
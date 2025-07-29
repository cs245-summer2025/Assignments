package lists;
import static org.junit.jupiter.api.Assertions.*;

class DListTest {
    @org.junit.jupiter.api.Test // 1 point
    void testPartitionSmall() {
        int[] values = {1, 5, 10, 7, 3, 2, 4, 3};
        int[] afterPartition = {10, 2, 4, 1, 5, 7, 3, 3};
        DList myList = new DList();
        DList expected = new DList();
        for(int idx = 0; idx < values.length; idx ++) {
            myList.addLast(values[idx]);
            expected.addLast(afterPartition[idx]);
        }
        myList.partition();
        assertTrue(myList.equals(expected));
    }

    @org.junit.jupiter.api.Test // 1 point
    void testAlreadyPartitioned() {
        int[] values = {2, 4, 6, 8, 10, 1, 3, 5, 7};
        int[] afterPartition = {2, 4, 6, 8, 10, 1, 3, 5, 7};
        DList myList = new DList();
        DList expected = new DList();
        for(int idx = 0; idx < values.length; idx ++) {
            myList.addLast(values[idx]);
            expected.addLast(afterPartition[idx]);
        }
        myList.partition();
        assertTrue(myList.equals(expected));
    }

    @org.junit.jupiter.api.Test // 2 point
    void testHalves() {
        int[] values = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] afterPartition = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        DList myList = new DList();
        DList expected = new DList();
        for(int idx = 0; idx < values.length; idx ++) {
            myList.addLast(values[idx]);
            expected.addLast(afterPartition[idx]);
        }
        myList.partition();
        assertTrue(myList.equals(expected));
    }
}
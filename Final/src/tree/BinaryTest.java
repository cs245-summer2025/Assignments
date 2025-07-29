package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BinaryTest{
    /*
        Q3 Tests
     */
    @Test// 1 point
    void testPathSumSimple() {
        BinaryTree bt = new BinaryTree(4);
        BinaryTree.BinaryNode root = bt.root;
        root.left = new BinaryTree.BinaryNode(0);
        root.right = new BinaryTree.BinaryNode(1);
        assertTrue(bt.pathSum() == 81);
    }

    @Test// 1 point
    void testPathSumLeft() {
        BinaryTree bt = new BinaryTree(4);
        BinaryTree.BinaryNode root = bt.root;
        root.left = new BinaryTree.BinaryNode(0);
        root.left.left = new BinaryTree.BinaryNode(6);
        root.left.right = new BinaryTree.BinaryNode(4);
        assertTrue(bt.pathSum() == 810);
    }

    /*
        Q4 Tests
     */

    @Test// 1 point
    void testSimpleReconstruction(){
        Integer[] pre = {14, 13, 22};
        Integer[] in = {13, 14, 22};
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> preOrderOriginal = Arrays.asList(pre);
        preOrder.addAll(Arrays.asList(pre));

        List<Integer> inOrder = new ArrayList<>();
        inOrder.addAll(Arrays.asList(in));
        BinaryTree binTree = BinaryTree.reconstructTree(preOrder, inOrder);

        assertTrue(binTree.getPreOrderRepr().equals(preOrderOriginal));
        assertTrue(binTree.getInOrderRepr().equals(inOrder));
    }

    @Test// 1 point
    void testLeftReconstruction(){
        Integer[] pre = {14, 22, 13};
        Integer[] in = {13, 22, 14};
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> preOrderOriginal = Arrays.asList(pre);
        preOrder.addAll(Arrays.asList(pre));

        List<Integer> inOrder = new ArrayList<>();
        inOrder.addAll(Arrays.asList(in));
        BinaryTree binTree = BinaryTree.reconstructTree(preOrder, inOrder);

        assertTrue(binTree.getPreOrderRepr().equals(preOrderOriginal));
        assertTrue(binTree.getInOrderRepr().equals(inOrder));
    }

    @Test// 1 point
    void testRightReconstruction(){
        Integer[] pre = {14, 22, 13};
        Integer[] in = {14, 22, 13};
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> preOrderOriginal = Arrays.asList(pre);
        preOrder.addAll(Arrays.asList(pre));

        List<Integer> inOrder = new ArrayList<>();
        inOrder.addAll(Arrays.asList(in));
        BinaryTree binTree = BinaryTree.reconstructTree(preOrder, inOrder);

        assertTrue(binTree.getPreOrderRepr().equals(preOrderOriginal));
        assertTrue(binTree.getInOrderRepr().equals(inOrder));
    }
}
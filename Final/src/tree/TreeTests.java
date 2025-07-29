package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class TreeTests{
    /*
        Q5 Tests
     */
    @Test// 2 points
    void testBinaryTree() {
        int[] leftValues = {1,10, 4, -1};
        int[] rightValues = {56, 4, 4, 1};
        int[] expected = {1, 4, 4, 56, -1, 4, 10, 1, -98, 56, 5};
        List<Integer> expectedOutput = new ArrayList<>();

        for(int e: expected){
            expectedOutput.add(e);
        }

        Tree tree = new Tree(5);
        tree.root.addChild(56);
        tree.root.addChild(-98);

        Tree.TreeNode left = tree.root.getChildren().get(0);
        Tree.TreeNode right = tree.root.getChildren().get(1);
        left.addChildren(leftValues);
        right.addChildren(rightValues);

        List<Integer> result = tree.reverseLevelOrder();
        assertTrue(expectedOutput.equals(result));
    }

    @Test // 2 points
    void testLine() {
        int[] values = {5, -10, 4, 3, 2, 18, 23, 18, 22};
        int[] expected = {22, 18, 23, 18, 2, 3, 4, -10, 5, 100};
        List<Integer> expectedOutput = new ArrayList<>();

        for(int e: expected){
            expectedOutput.add(e);
        }

        Tree tree = new Tree(100);
        Tree.TreeNode parent = tree.root;
        for(int n: values){
            parent.addChild(n);
            parent = parent.getChildren().get(0);
        }
        List<Integer> result = tree.reverseLevelOrder();
        assertTrue(expectedOutput.equals(result));
    }
}
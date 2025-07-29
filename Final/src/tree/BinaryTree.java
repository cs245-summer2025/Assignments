package tree;

import java.util.*;

public class BinaryTree {

    // Should be made private/protected but public for grading purposes
    public  BinaryNode root;

    public BinaryTree(int value) {
        this.root = new BinaryNode(value);
    }

    public BinaryTree(BinaryNode node) {
        this.root = node;
    }
    public static class BinaryNode {
        public int value;
        public BinaryNode left;
        public BinaryNode right;

        public BinaryNode(int value){
            this.value = value;
        }

        public BinaryNode(int value, BinaryNode left, BinaryNode right){
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    /*
        Question 3
     */
    public int pathSum(){
        // TODO
        return -1;
    }


    /*
        Question 4
     */
    public static BinaryTree reconstructTree(List<Integer> preOrder, List<Integer> inOrder) {
        // TODO
        return null;
    }


    /*
        Do not modify these methods. Used for testing purposes
     */
    public List<Integer> getPreOrderRepr(){
        List<Integer> preOrder = new ArrayList<>();
        getPreOrderHelper(root, preOrder);
        return preOrder;
    }

    private void getPreOrderHelper(BinaryNode node, List<Integer> preOrder) {
        if(node == null) {
            return;
        }
        preOrder.add(node.value);
        getPreOrderHelper(node.left, preOrder);
        getPreOrderHelper(node.right, preOrder);
    }

    public List<Integer> getInOrderRepr(){
        List<Integer> inOrder = new ArrayList();
        getInOrderHelper(root, inOrder);
        return inOrder;
    }
    private void getInOrderHelper(BinaryNode node, List<Integer> inOrder) {
        if(node == null) {
            return;
        }
        getInOrderHelper(node.left, inOrder);
        inOrder.add(node.value);
        getInOrderHelper(node.right, inOrder);
    }
}

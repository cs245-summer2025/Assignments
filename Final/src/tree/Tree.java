package tree;

import java.util.*;

public class Tree {

    public TreeNode root;

    public Tree(int value) {
        this.root = new TreeNode(value);
    }
    public static class TreeNode {
        public int value;
        private List<TreeNode> children;

        public TreeNode(int value){
            this.value = value;
            this.children = new ArrayList<TreeNode>();
        }

        public void addChild(int n){
            TreeNode child = new TreeNode(n);
            this.children.add(child);
        }

        public void addChildren(int[] childrenValues){
            for(Integer n: childrenValues){
                TreeNode child = new TreeNode(n);
                this.children.add(child);
            }
        }
        public List<TreeNode> getChildren(){
            return children;
        }
    }

    /*
        Question 5
     */
    public List<Integer> reverseLevelOrder(){
        // TODO
        return null;
    }
}

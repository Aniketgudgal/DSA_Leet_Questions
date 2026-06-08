/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> al = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        // root left right
        if (root == null) {
            return al;
        }
        al.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return al;
    }
}

class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return al;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            al.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return al;
    }
}
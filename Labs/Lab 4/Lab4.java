// Java definition for TreeNodes
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Lab4 {

    public TreeNode invertTree(TreeNode root) {

        // Base case
        if (root == null) {
            return null;
        }

        // Invert left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursive calls
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
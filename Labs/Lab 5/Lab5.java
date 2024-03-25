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
public class Lab5 {

    public boolean isValidBST(TreeNode root) {
        return validateBST(root, null, null);
    }

    // Helper method for isValidBST
    public boolean validateBST(TreeNode root, Integer lower, Integer upper) {

        // Base case
        if (root == null) {
            return true;
        }

        // Constraints to make sure root is in proper range
        else if (lower != null && root.val <= lower || upper != null && root.val >= upper) {
            return false;
        }

        // Traverse down left and right subtrees
        return validateBST(root.left, lower, root.val) && validateBST(root.right, root.val, upper);
    }
}

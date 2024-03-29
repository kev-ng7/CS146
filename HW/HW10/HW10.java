import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class HW10 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // Final list of the level order traversal of binary tree nodes' values
        List<List<Integer>> result = new ArrayList<>();

        // If given an empty tree, return an empty list
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode currentNode = queue.remove();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}

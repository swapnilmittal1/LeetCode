/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return ans;
        }
        helper(root, 0);
        return ans;
    }

    void helper(TreeNode node, int level){
        if(level == ans.size()){
            ans.add(node.val);
        }
        
        if(node.right != null){
            helper(node.right, level + 1);
        }
        if(node.left != null){
            helper(node.left, level + 1);
        }

    }
}
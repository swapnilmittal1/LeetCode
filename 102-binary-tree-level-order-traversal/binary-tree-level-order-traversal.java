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
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
    if(root == null) {
        return list;
    }
    helper(root,0);
    return list;
    

    }
    void helper(TreeNode root, int level) {
        if(list.size() == level){
            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);
            list.add(arr);
        } else {
            list.get(level).add(root.val);
        }

        if(root.left == null && root.right == null ) {
            return;
        }
        
        if(root.left != null){
            helper(root.left, level +1);
        }

        if(root.right != null){
            helper(root.right, level +1 );
        }
    }




}
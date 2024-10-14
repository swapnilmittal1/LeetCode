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
    int preIndex = 0;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder, 0 , preorder.length - 1);
    }

    TreeNode helper(int[] preorder, int left, int right){
        if (left > right) {
            return null;
        }
        int index = preIndex;
        preIndex++;

        TreeNode root = new TreeNode(preorder[index]);
        int mid = map.get(preorder[index]);


        root.left = helper(preorder, left, mid - 1);
                root.right = helper(preorder, mid + 1, right);

        return root;



    }
}
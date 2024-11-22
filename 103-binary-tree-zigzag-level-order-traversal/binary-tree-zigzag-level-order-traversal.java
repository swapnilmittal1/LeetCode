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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean reverse = false;

        while(!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < levelSize; i++) {
                if(!reverse) {
                    TreeNode currNode = deque.pollFirst();
                    level.add(currNode.val);

                    if(currNode.left != null) {
                        deque.addLast(currNode.left);
                    }
                    if(currNode.right != null) {
                        deque.addLast(currNode.right);
                    }
                } else {
                    TreeNode currNode = deque.pollLast();
                    level.add(currNode.val);

                    if(currNode.right != null) {
                        deque.addFirst(currNode.right);
                    }
                    if(currNode.left != null) {
                        deque.addFirst(currNode.left);
                    }
                }
            }

            reverse = !reverse;
            result.add(level);
        }

        return result;
    }
}
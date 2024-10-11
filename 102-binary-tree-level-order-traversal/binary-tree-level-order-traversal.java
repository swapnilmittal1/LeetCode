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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<TreeNode> tempList = new ArrayDeque<>();

        if(root != null){
            tempList.add(root);
            
        }


        while(!tempList.isEmpty()){
            List<Integer> levelList = new ArrayList<>();

            for(int i = 0, level = tempList.size(); i< level; i++ ){
                TreeNode tempNode = tempList.poll();

                levelList.add(tempNode.val);

                if(tempNode.left != null){
                    tempList.add(tempNode.left);
                }

                if(tempNode.right != null){
                tempList.add(tempNode.right);}

            }
            list.add(levelList);

        }

        return list;



    }
}
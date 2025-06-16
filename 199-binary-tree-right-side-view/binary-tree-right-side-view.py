# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):

        self.ans = []

    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return self.ans
        self.helper(root, 0)
        return self.ans

    def helper(self, node, level):

        if level == len(self.ans):
            self.ans.append(node.val)

        if node.right:
            self.helper(node.right, level + 1)

        if node.left:
            self.helper(node.left, level + 1)


class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        ans = []

        def dfs(i, sumT):
            if (sumT == target):
                result.append(ans.copy())
                return
            if (sumT > target or i == len(candidates)):
                return

            ans.append(candidates[i])
            dfs(i, sumT + candidates[i])
            del ans[-1]
            dfs(i + 1, sumT)

        dfs(0, 0)
        return result

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, 0, target, 0);
        return result;
    }

    void dfs(int[] arr, int i, int target, int sum) {
        if(sum == target) {
            result.add(new ArrayList<>(ans));
            return;
        }
        if(sum > target || i == arr.length){
            return;
        }
        ans.add(arr[i]);
        dfs(arr, i, target, sum + arr[i]);
        ans.remove(ans.size() - 1);
        dfs(arr, i + 1, target, sum);

    }
}
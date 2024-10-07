class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, 0, 0, target);
        return ans;
    }

    void helper(int[] nums, int i, int sum, int target){
        if(sum == target) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        if((sum > target) || i >= nums.length) {
            return;
        }

        helper(nums, i + 1, sum, target);
        sub.add(nums[i]);
        helper(nums, i, sum + nums[i], target);
        sub.remove(sub.size() - 1);
    }
}
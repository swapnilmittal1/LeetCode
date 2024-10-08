class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, 0, 0);
        return ans;

        
    }

    void helper(int[] nums, int target, int i, int sum) {
        if(sum == target){
            ans.add(new ArrayList<>(subset));
            return;
        }

        if((sum > target) || i == nums.length) {
            return;
        }
        
        // when we do want to add nums[i]
        subset.add(nums[i]);

        helper(nums, target, i + 1, sum + nums[i] );

        // when we do not want to add nums[i]

        subset.remove(subset.size() - 1);

        while((i + 1 < nums.length) && (nums[i] == nums[i + 1])) {
            i++;
        }

        helper(nums, target, i + 1, sum);
    }

}
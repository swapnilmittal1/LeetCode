class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();


    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0);
        return ans;
        
    }
    void helper(int[] nums, int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        helper(nums, i + 1);

        subset.remove(subset.size() - 1);
        helper(nums, i + 1);


    }
}
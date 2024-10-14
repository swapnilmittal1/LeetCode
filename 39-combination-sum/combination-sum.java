class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, 0, 0, target);
        return ans;
    }
    void helper(int[] candidates, int i, int sum, int target){
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target || i == candidates.length){
            return;
        }


        list.add(candidates[i]);
        helper(candidates, i, sum + candidates[i], target);
                list.remove(list.size() - 1);

        helper(candidates, i + 1, sum, target);


    }
}
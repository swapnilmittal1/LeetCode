class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        if(nums.length == 1){
            List<Integer> sub = new ArrayList<>();
            sub.add(nums[0]);
            ans.add(sub);
            return ans;
        }

        for(int i = 0; i < nums.length; i++){
            int[] remaining = new int[nums.length - 1];
            int index_remaining = 0;

            for(int j = 0; j < nums.length; j++) {
                if(i != j){
                    remaining[index_remaining++] = nums[j];
                }
            }
            List<List<Integer>> perms = new ArrayList<>();
            perms = permute(remaining);

            for(List<Integer> perm : perms){
                perm.add(nums[i]);
                ans.add(new ArrayList<>(perm));
            }

        }
        return ans;



        
    }
}
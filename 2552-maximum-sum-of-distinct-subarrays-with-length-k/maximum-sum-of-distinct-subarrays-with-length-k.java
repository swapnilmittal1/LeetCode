class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int begin = 0;
        long curSum = 0;
        long maxSum = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int end = 0; end < n; end++) {
            if(!set.contains(nums[end])){
                curSum += nums[end];
                set.add(nums[end]);

                if(end - begin + 1 == k) {
                    maxSum = Math.max(curSum, maxSum);
                    curSum -= nums[begin];
                    set.remove(nums[begin]);
                    begin++;
                }
            } else {
                while(nums[begin] != nums[end]) {
                    curSum -= nums[begin];
                    set.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }

        return maxSum;


    }
}
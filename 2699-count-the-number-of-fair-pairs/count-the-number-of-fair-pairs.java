class Solution {
    long count = 0;


    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int left = lowerBound(nums, i + 1, nums.length - 1, lower - nums[i]);
            int right = upperBound(nums, i + 1, nums.length - 1, upper - nums[i]);
            count += right - left + 1;
        }
        return count;
    }

    int lowerBound(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = (end + start) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    } 

    int upperBound(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = (end + start) / 2;

            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}

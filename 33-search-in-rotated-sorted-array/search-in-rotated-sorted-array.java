class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // If the left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // target is in the left half
                } else {
                    left = mid + 1;   // target is in the right half
                }
            }
            // If the right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;   // target is in the right half
                } else {
                    right = mid - 1;  // target is in the left half
                }
            }
        }
        
        return -1;  // target was not found
    }
}

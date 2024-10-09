class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b) -> (a - b));

        for(int num : nums){
            maxHeap.offer(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();




    }
}
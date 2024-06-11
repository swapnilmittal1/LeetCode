

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Create a HashMap to count the frequency of each element in the array
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue (min-heap) to keep the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());

        // Iterate over the map's entry set and maintain the size of the heap to k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // Create an array to store the result
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }
}

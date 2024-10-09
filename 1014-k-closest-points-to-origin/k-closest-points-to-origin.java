
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Create a PriorityQueue that sorts based on distance in descending order
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> 
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        // Add points to the heap, maintaining only the k closest points
        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();  // Remove the farthest point if we have more than k
            }
        }

        // Extract the k closest points from the heap
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll();
        }

        return ans;
    }
}

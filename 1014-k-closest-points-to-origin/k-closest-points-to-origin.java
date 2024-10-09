class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>( (a,b) -> ( (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]) ) );

        for(int[] point : points){
            minHeap.offer(point);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }

        for(int i = 0; i < k; i++){    
            ans[i] = minHeap.poll();
        }

        return ans;
    }
}
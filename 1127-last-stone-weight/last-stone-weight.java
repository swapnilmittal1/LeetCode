class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int stone : stones) {
            minHeap.offer(-1 * stone);
        }

        while(minHeap.size() > 1){
            int max1 = minHeap.poll();
            int max2 = minHeap.poll();

            if(max1 == max2){
                continue;
            } else {
                minHeap.offer(max1 - max2);
            }
        }

        return ((minHeap.peek() == null) ? 0 : minHeap.peek() * -1);

    }
}
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }


        Map<Integer,Integer> count = new HashMap<>();

        for(int card : hand){
            count.put(card, 1 + count.getOrDefault(card ,0));
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(count.keySet());

        while(!minHeap.isEmpty()){
            int first = minHeap.peek();

            for(int i = first; i < first + groupSize; i++){

                if (!count.containsKey(i)){
                    return false;
                    }

                count.put(i, count.get(i) - 1);
                
                if(count.get(i) == 0){
                    minHeap.poll();
                }

            }
        }
        return true;
    }
}
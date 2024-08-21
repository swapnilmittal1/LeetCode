class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;

        for(int n : piles){
            if (max < n) {
                max = n;
            }
        }
        if (h == piles.length) {
            return max;
        }

        while(min <= max){
            int tempH = 0; int mid = (min + max) / 2;
            for(int n : piles){
                tempH += n/mid;
                if(n % mid > 0){
                    tempH++;

                }}
                if(tempH <= h && tempH > 0){
                    max = mid - 1;
                }
                else if(tempH > h || tempH < 0) {
                    min = mid + 1;
                }
        }
        return min;

    }
}
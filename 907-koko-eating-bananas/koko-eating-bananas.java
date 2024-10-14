class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;

        for (int n : piles){
            max = Math.max(max, n);
        }
        if(h == piles.length){
            return max;
        }


        while(min <= max){
            int time = 0;

            int mid = (min + max) / 2;

            for(int i = 0; i < piles.length;i++){

                time += (piles[i])/mid;
                if(piles[i] % mid > 0){
                    time++;
                }
                }

                if(time <= h && time > 0){
                    max = mid - 1;
                } else if(time > h || time < 0){
                    min = mid + 1;
                }
            }
            
            return min;

        }


    }

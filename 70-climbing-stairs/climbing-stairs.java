class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        if(n <= 2){
            return arr[n];
        }
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }



        return arr[n];
    }
}
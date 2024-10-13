class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totla_gas = 0;
        int totla_cost = 0;
        for(int i = 0; i < gas.length; i++){
            totla_gas += gas[i];
            totla_cost += cost[i];
        }
        if(totla_cost > totla_gas){
            return -1;
        }
        int ans = 0;
        int fuel = 0;
        for(int start = 0; start < gas.length; start++){
            fuel += gas[start] - cost[start];
            if(fuel < 0){
                ans = start + 1;
                fuel = 0;
            }


        }
        return ans;


    }
}
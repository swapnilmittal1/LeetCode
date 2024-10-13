class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();


    public boolean validTree(int n, int[][] edges) {
        if(n == 0){
            return false;
        }

        for(int i = 0; i < n;i++){
            map.put(i, new ArrayList<>());
        }
        for(int[] edge : edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        return dfs(0, -1) && visited.size() == n;



    }

    boolean dfs(int n, int prev){
        if(visited.contains(n)){
            return false;
        }
        visited.add(n);
        for(int i : map.get(n)){
            if(i == prev){
                continue;
            }
            if(!dfs(i, n)){
                return false;
            }
        }
        return true;
    }
}
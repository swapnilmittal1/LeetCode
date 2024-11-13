class UndergroundSystem {

    Map<Integer, Pair<String, Integer>> mapCheck;
    Map<Pair<String, String>, int[]> distance;

    public UndergroundSystem() {
        this.mapCheck = new HashMap<>();
        this.distance = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        mapCheck.put(id, new Pair(stationName, t));

    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> item = mapCheck.get(id);
        Pair dist = new Pair(item.getKey(), stationName);
        distance.putIfAbsent(dist, new int[2]);
        distance.get(dist)[0] += (t - item.getValue());
        distance.get(dist)[1]++;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int[] arr = distance.get(new Pair(startStation, endStation));
        return ((double)arr[0])/arr[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
class RandomizedSet {
Map<Integer,Integer> set;
List<Integer> list;
    public RandomizedSet() {
        set = new HashMap<>();
        list = new ArrayList<>();

    }
    
    public boolean insert(int val) {
        if(!set.containsKey(val)){
            set.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.containsKey(val)){
            int idx = set.get(val);
            int lastIdx = list.size() - 1;

            list.set(idx, list.get(lastIdx));

            set.put(list.get(idx), idx);
            list.remove(lastIdx);

            set.remove(val);

            return true;
        }

        return false;

    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));


    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class OrderedStream {
    List<String> arr;
    int pntr = 0;
    int length;
    public OrderedStream(int n) {
        length = n;
        arr = new ArrayList<>();
        for(int i = 0; i < n;i++) {
            arr.add("");
        }

    }
    
    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<>();
        arr.remove(idKey - 1);
        arr.add(idKey - 1, value);
        if(pntr == idKey - 1){
            for(int i = idKey - 1; i < length; i++){
                if(!arr.get(i).equals("")){
                    res.add(arr.get(i));
                    pntr++;
                } else {
                    break;
                }
            }
        }

        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
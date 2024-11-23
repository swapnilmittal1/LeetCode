class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list= new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(i + 1);
        }
        int pntr = 0;
        while(list.size() != 1){
            pntr = (pntr + k - 1) % list.size();
            list.remove(pntr);
        }

        return list.get(0);
    }
}
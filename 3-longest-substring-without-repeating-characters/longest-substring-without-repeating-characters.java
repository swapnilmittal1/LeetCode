class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxL = 0;


        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= left){
                left = map.get(s.charAt(i)) + 1;
            } else {
                maxL = Math.max(maxL, i - left + 1);
            }
            map.put(s.charAt(i), i);
        }
        return maxL;
    }
}
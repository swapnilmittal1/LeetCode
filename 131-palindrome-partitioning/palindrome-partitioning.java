class Solution {
    List<List<String>> ans = new ArrayList<>();
    List<String> subset = new ArrayList<>();


    public List<List<String>> partition(String s) {
        helper(s, 0);
        return ans;



    }

    void helper(String s, int i){
        if(i >= s.length()){
            ans.add(new ArrayList<>(subset));
            return;
        }

        for(int j = i; j < s.length(); j++) {
            if(isPalindrome(s, i, j)){
                subset.add(s.substring(i, j + 1));
                helper(s, j + 1);
                subset.remove(subset.size() - 1);
            }
        }
        
    }
    boolean isPalindrome(String s, int start, int e){
        while(start < e){
            if(s.charAt(start) != s.charAt(e)){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
}
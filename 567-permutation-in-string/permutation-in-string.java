class Solution {
    private boolean checkEquals(int[] arr1, int[] arr2){
        for(int i = 0; i < 26;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] temp = new int[26];
        for(int i = 0; i < s1.length(); i++){
            temp[s1.charAt(i) - 'a']++;
        }
        int i = 0;
        int windowSize = s1.length();
        int[] temp1 = new int[26];
        while(i < windowSize && i < s2.length()) {
            temp1[s2.charAt(i) - 'a']++;
            i++;
        }

        if(checkEquals(temp, temp1)){
            return true;
        }
        while(i < s2.length()) {
            temp1[s2.charAt(i - windowSize) - 'a']--;
            temp1[s2.charAt(i) - 'a']++;
            if(checkEquals(temp,temp1)){
                return true;
            }
            i++;
        }
        return false;
    }
}

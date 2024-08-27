class Solution {

    private boolean checkEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] temp = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            temp[s1.charAt(i) - 'a']++;
        }

        int i = 0;
        int windowSize = s1.length();

        int[] temp1 = new int[26];
        while (i < windowSize && i < s2.length()) {
            temp1[s2.charAt(i) - 'a']++;
            i++;
        }

        if (checkEqual(temp, temp1)) {
            return true;
        }

        while (i < s2.length()) {
            temp1[s2.charAt(i - windowSize) - 'a']--;
            temp1[s2.charAt(i) - 'a']++;
            i++;
            if (checkEqual(temp, temp1)) {
                return true;
            }
        }

        return false;
    }
}

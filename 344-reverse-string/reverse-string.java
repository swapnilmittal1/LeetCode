class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int l = s.length - 1;
        char q;
        while(i < l) {
            q = s[i];
            s[i] = s[l];
            s[l] = q;
            i++;
            l--;
        }
    }
}
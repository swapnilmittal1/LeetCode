class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();

        int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;
        while(num > 0){
            if(num >= number[i]) {
                ans.append(str[i]);
                num = num - number[i];
            } else {
                i++;
            }
        }
        return ans.toString();
    }
}
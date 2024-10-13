class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int right = numbers.length - 1;
        int i = 0;
        while(i < right){

            if(numbers[i] + numbers[right] == target){
                return new int[]{i + 1, right + 1};
            } else if(numbers[i] + numbers[right] > target){
                right--;
                ;
            } else {
                i++;
            }
        }

        return new int[2];
    }
}
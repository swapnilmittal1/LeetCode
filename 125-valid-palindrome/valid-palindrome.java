class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
         
         for(int i = 0; i < arr.length; i++){
            arr[i] = Character.toLowerCase(arr[i]);
         }

         int i = 0;
         int j = arr.length - 1;

         while(i < arr.length){
            if(!Character.isLetterOrDigit(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[j])){
                j--;;
                continue;
            }
            if(arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
         }
         return true;
    }
}
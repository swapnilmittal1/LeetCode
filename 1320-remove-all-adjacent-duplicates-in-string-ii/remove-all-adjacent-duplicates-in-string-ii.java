class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Integer> intS = new Stack<>();
        Stack<Character> charS = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!charS.isEmpty() && c == charS.peek()){
                intS.push(intS.peek() + 1);
            } else {
                intS.push(1);
            }

            charS.push(c);
            if(intS.peek() == k){
                for(int i = 0; i < k; i++){
                    charS.pop();
                    intS.pop();
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        int ntnt = charS.size();
        for(int i = 0; i < ntnt; i++){
            sb.append(charS.pop());
        }
        
        return sb.reverse().toString();
    }

}
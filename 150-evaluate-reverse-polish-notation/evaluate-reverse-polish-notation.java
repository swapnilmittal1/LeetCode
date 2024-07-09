class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int i1 = stack.pop();
                int i2 = stack.pop();

                int res = 0;

                if (token.equals("+")) {
                    res = i2 + i1;
                } else if (token.equals("-")) {
                    res = i2 - i1;
                } else if (token.equals("*")) {
                    res = i2 * i1;
                } else {
                    res = i2 / i1;
                }

                stack.push(res);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}

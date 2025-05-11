class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for cha in s:
            if cha == '(':
                stack.append(')')
            elif cha == '{':
                stack.append('}')
            elif cha == '[':
                stack.append(']')
            else:
                if len(stack) != 0 and stack[len(stack) - 1] == cha:
                    stack.pop()
                else:
                    return False
        return len(stack) == 0
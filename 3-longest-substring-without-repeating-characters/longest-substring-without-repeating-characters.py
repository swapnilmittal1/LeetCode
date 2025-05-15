class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        map = {}

        maxL = 0
        left = 0

        for i, char in enumerate(list(s)):
            if char in map and map.get(char) >= left:
                left = map.get(char) + 1
            else:
                maxL = max(maxL, i - left + 1)
            map[char] = i

        return maxL




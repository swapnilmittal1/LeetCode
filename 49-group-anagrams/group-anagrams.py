from collections import Counter
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapAna = {}
        ans = []
        for i in strs:
            c = tuple(sorted(i))
            if c in mapAna.keys():
                mapAna.get(c).append(i)
            else:
                mapAna[c] = [i]
        
        for counter, listI in mapAna.items():
            ans.append(listI)

        return ans
